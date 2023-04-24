import styled from "styled-components";
import axios from "axios";
import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";

export function BookRecommendation() {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    axios
      .get(
        "https://openlibrary.org/api/books?bibkeys=ISBN:0451526538,ISBN:059035342X,ISBN:0141439564&format=json&jscmd=data"
      )
      .then((response) => {
        const booksData = Object.values(response.data).map((book) => {
          return {
            title: book.title,
            author: book.authors[0].name,
            image: book.cover.medium,
            link: `https://openlibrary.org${book.key}`,
          };
        });
        setBooks(booksData);
      })
      .catch((error) => console.log(error));
  }, []);

  // return (
  //   <StyledBookRecommendation>
  //     <h1>Books</h1>
  //     <div className="boxex-wrapper">
  //       <StyledBox>
  //         <img
  //           src="https://plus.unsplash.com/premium_photo-1673264933445-0112f3cdcb2f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
  //           alt=""
  //         />
  //         <div className="styled-box-wrapper">
  //           <h2>Book Title</h2>
  //           <p>
  //             Written by: <span className="author-name"></span>
  //           </p>

  //           <button>See details</button>
  //         </div>
  //       </StyledBox>

  //       <StyledBox>
  //         <img
  //           src="https://plus.unsplash.com/premium_photo-1673264933445-0112f3cdcb2f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
  //           alt=""
  //         />
  //         <div className="styled-box-wrapper">
  //           <h2>Book Title</h2>
  //           <p>
  //             Written by: <span className="author-name"></span>
  //           </p>

  //           <button>See details</button>
  //         </div>
  //       </StyledBox>

  //       <StyledBox>
  //         <img
  //           src="https://plus.unsplash.com/premium_photo-1673264933445-0112f3cdcb2f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
  //           alt=""
  //         />
  //         <div className="styled-box-wrapper">
  //           <h2>Book Title</h2>
  //           <p>
  //             Written by: <span className="author-name"></span>
  //           </p>

  //           <button>See details</button>
  //         </div>
  //       </StyledBox>
  //     </div>
  //     <StyledSeeMoreBtn>
  //       <button className="seeMoreBooks">See more books</button>
  //     </StyledSeeMoreBtn>
  //   </StyledBookRecommendation>
  // );

  return (
    <StyledBookRecommendation>
      <h1>Books</h1>
      <div className="boxex-wrapper">
        {books.map((book) => (
          <StyledBox key={book.link}>
            <img src={book.image} alt={`${book.title} book cover`} />
            <div className="styled-box-wrapper">
              <h2>{book.title}</h2>
              <p>
                Written by: <span className="author-name">{book.author}</span>
              </p>

              <a href={book.link} target="_blank" rel="noopener noreferrer">
                <button>See details</button>
              </a>
            </div>
          </StyledBox>
        ))}
      </div>
      <StyledSeeMoreBtn>
        <button className="seeMoreBooks">
          <Link to="/books">See more books</Link>
        </button>
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
  height: 500px;

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

  .seeMoreBooks a {
    text-decoration: none;
    color: #000;
  }
`;
