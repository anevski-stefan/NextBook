import styled from "styled-components";
export function Nav() {
  return (
    <StyledNav>
      <h1>SharedLibrary</h1>
      <ul className="nav-menu">
        <li className="menu-link">
          <a href="#books">Books</a>
        </li>
        <li className="menu-link">
          <a href="#about-us">About us</a>
        </li>
        <li className="menu-link">
          <a href="#contact">Contact</a>
        </li>
        <li className="menu-link">
          <a href="#log-in">Log In</a>
        </li>
        <li className="menu-link">
          <a href="#sign-up">Sign up</a>
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
    justify-content: space-between;
    margin: 30px;
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
