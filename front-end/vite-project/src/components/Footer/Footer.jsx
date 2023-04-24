import styled from "styled-components";

export function Footer() {
  return (
    <StyledFooter>
      <ul className="left-menu">
        <li>NextBook</li>
        <li>Some where,</li>
        <li>Some place,</li>
        <li>On this planet</li>
        <li>Copyright © 2023 NextBook</li>
      </ul>
      <ul className="right-menu">
        <li>
          <a href="http://localhost:5173/books">Books</a>
        </li>
        <li>
          <a href="http://localhost:5173/about-us">About Us</a>
        </li>
        <li>
          <a href="http://localhost:5173/contact">Contact</a>
        </li>
      </ul>
    </StyledFooter>
  );
}

const StyledFooter = styled.footer`
  text-align: center;
  margin-top: 60px;
  font-size: 1.3rem;
  background-color: #484545;
  padding: 20px 150px;
  display: flex;
  justify-content: space-between;
  align-items: center;

  .left-menu {
    color: #cacacb;
  }

  .right-menu li a {
    color: #cacacb;
    text-decoration: none;
  }

  .left-menu,
  .right-menu {
    list-style: none;
  }

  .left-menu li:nth-child(2),
  .left-menu li:nth-child(3),
  .left-menu li:nth-child(4),
  .left-menu li:nth-child(5) {
    font-size: 1rem;
  }

  .right-menu li a {
    font-size: 1rem;
    text-decoration: underline;
  }

  .left-menu li,
  .right-menu li {
    line-height: 1.5;
  }
`;
