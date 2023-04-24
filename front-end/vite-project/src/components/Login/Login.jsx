import React from "react";
import { Link } from "react-router-dom";
import styled from "styled-components";

export function Login({}) {
  return (
    <StyledContainer>
      <h1>Log in</h1>
      <StyledLogin>
        <div className="form_input">
          <label htmlFor="username">Username: </label>
          <input type="text" id="username" name="username" />
        </div>
        <div className="form_input">
          <label htmlFor="password">Password: </label>
          <input type="password" id="password" name="password" />
        </div>
        <div className="form_input">
          <button>Log in</button>
        </div>
        <div className="form_input">
          <p>
            Don't have an account? <Link to="/register">Register</Link>
          </p>
        </div>
      </StyledLogin>
    </StyledContainer>
  );
}

const StyledContainer = styled.div`
  h1 {
    margin: 40px;
    text-align: center;
  }
`;

const StyledLogin = styled.form`
  width: 50%;
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: 0 auto;

  .form_input {
    display: flex;
    flex-direction: column;
    margin: 10px;
  }

  .form_input label {
    font-size: 0.9rem;
  }

  #f-name,
  #s-name,
  #username,
  #password {
    height: 30px;
    width: 200px;
  }

  .form-input input {
    height: 50px;
  }

  button {
    padding: 5px 30px;
    font-size: 1rem;
    letter-spacing: 1px;
  }
`;
