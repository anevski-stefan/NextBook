import React from "react";
import styled from "styled-components";

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

const styledWrapperContainer = styled.div`
  .title {
    width: 100%;
    text-align: center;
  }
`;

const StyledContainer = styled.div`
  display: flex;
  justify-content: center;
`;

const StyledCategory = styled.div`
  background-color: #726d6d;
  margin: 10px;
  padding: 25px 25px;
  width: 30%;
  font-size: 1.7rem;
  height: 150px;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
`;
