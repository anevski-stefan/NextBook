import { Link } from "react-router-dom";
import styled from "styled-components";
export function Nav() {
  return (
    <StyledNav>
      <h1>Next Book</h1>
      <ul className="nav-menu">
        <li className="menu-link">
          <Link to="/">Home</Link>
        </li>
        <li className="menu-link">
          <Link to="/books">Books</Link>
        </li>
        <li className="menu-link">
          <Link to="/aboutus">About us</Link>
        </li>
        <li className="menu-link">
          <Link to="/login">LogIn / Sign Up</Link>
        </li>
      </ul>
    </StyledNav>
  );
}

const StyledNav = styled.nav`
  display: flex;
  align-items: center;
  justify-content: space-around;

  h1 {
    letter-spacing: 1.5px;
    color: #cacacb;
  }

  .nav-menu {
    display: flex;
    list-style: none;
    width: 40%;
    justify-content: space-evenly;
    margin: 30px;
    margin-right: 0;
  }

  .nav-menu li a {
    text-decoration: none;
    text-transform: uppercase;
    color: #cacacb;
    letter-spacing: 1.5px;
  }

  .nav-menu li a:hover {
    border-bottom: 1px solid #cacacb;
    padding-bottom: 5px;
  }
`;
