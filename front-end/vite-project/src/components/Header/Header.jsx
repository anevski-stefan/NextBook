import { Nav } from "../NavBar/Nav";
import styled from "styled-components";

export function Header() {
  return (
    <StyledHeader>
      <Nav />
      <h1 className="titleHeading">
        Discover a World of Books: Your Online Destination for Free Reading
      </h1>
    </StyledHeader>
  );
}

const StyledHeader = styled.header`
  height: 80vh;
  background-color: #484545;

  .titleHeading {
    height: 400px;
    display: flex;
    justify-content: center;
    align-items: center;
    color: #cacacb;
    letter-spacing: 2px;
  }
`;
