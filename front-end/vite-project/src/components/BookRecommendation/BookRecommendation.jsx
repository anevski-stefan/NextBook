import styled from "styled-components";

export function BookRecommendation() {
  return (
    <StyledBookRecommendation>
      <h1>Books</h1>
      <div className="boxex-wrapper">
        <StyledBox>
          <img
            src="https://plus.unsplash.com/premium_photo-1673264933445-0112f3cdcb2f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
            alt=""
          />
          <div className="styled-box-wrapper">
            <h2>Book Title</h2>
            <p>
              Written by: <span className="author-name"></span>
            </p>

            <button>See details</button>
          </div>
        </StyledBox>

        <StyledBox>
          <img
            src="https://plus.unsplash.com/premium_photo-1673264933445-0112f3cdcb2f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
            alt=""
          />
          <div className="styled-box-wrapper">
            <h2>Book Title</h2>
            <p>
              Written by: <span className="author-name"></span>
            </p>

            <button>See details</button>
          </div>
        </StyledBox>

        <StyledBox>
          <img
            src="https://plus.unsplash.com/premium_photo-1673264933445-0112f3cdcb2f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
            alt=""
          />
          <div className="styled-box-wrapper">
            <h2>Book Title</h2>
            <p>
              Written by: <span className="author-name"></span>
            </p>

            <button>See details</button>
          </div>
        </StyledBox>
      </div>
      <StyledSeeMoreBtn>
        <button className="seeMoreBooks">See more books</button>
      </StyledSeeMoreBtn>
    </StyledBookRecommendation>
  );
}

const StyledBookRecommendation = styled.div`
  h1 {
    text-align: center;
    margin: 80px;
  }

  .boxex-wrapper {
    display: flex;
    justify-content: center;
  }

  .styled-box-wrapper {
    margin: 20px;
  }

  .styled-box-wrapper h2,
  .styled-box-wrapper p {
    margin: 10px 0;
  }

  .styled-box-wrapper > button {
    padding: 10px 20px;
  }
`;

const StyledBox = styled.div`
  border: 1px solid black;
  margin: 10px;
  width: 20%;
  text-align: center;
  height: 100%;

  img {
    height: 70%;
    width: 100%;
  }
`;

const StyledSeeMoreBtn = styled.div`
  display: flex;
  justify-content: center;
  margin: 30px 0;

  .seeMoreBooks {
    padding: 10px 20px;
    font-size: 1rem;
    letter-spacing: 1px;
  }
`;
