import React from "react";
import styled from "styled-components";

const StyledCategory = styled.div`
  background-color: #484545;
  margin: 10px;
  padding: 25px 25px;
  font-size: 1.1rem;
  cursor: pointer;
  width: 40%;
  text-align: center;
  color: #cacacb;
`;

const categories = (props) => {
  return (
    <div className="container">
      <StyledTitle>Categories</StyledTitle>
      <StyledContainer>
        {props.categories.map((item) => {
          return <StyledCategory>{item.name}</StyledCategory>;
        })}
      </StyledContainer>
    </div>
  );
};

export default categories;

const StyledTitle = styled.h1`
  text-align: center;
  margin: 80px;
`;

const StyledContainer = styled.div`
  width: 100%;
  display: flex;
  justify-content: center;
  flex-wrap: wrap;
`;
