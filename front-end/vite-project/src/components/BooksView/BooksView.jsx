import styled from "styled-components";
import React, { useState, useEffect } from "react";

const StyledBoxWrapper = styled.div`
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
`;

export function BooksView() {
  const [books, setBooks] = useState([]);
  const [showDetails, setShowDetails] = useState(false);
  const [selectedBook, setSelectedBook] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      const response = await fetch(
        "https://openlibrary.org/search.json?q=javascript&limit=10"
      );
      const data = await response.json();
      setBooks(data.docs);
    };

    fetchData();
  }, []);

  const handleSeeMore = (book) => {
    setSelectedBook(book);
    setShowDetails(true);
  };

  return (
    <>
      <StyledBooksView>All books</StyledBooksView>
      <StyledBoxWrapper>
        {books.map((book) => (
          <StyledBox key={book.key} onClick={() => handleSeeMore(book)}>
            <div className="book-image">
              {book.cover_i ? (
                <img
                  src={`http://covers.openlibrary.org/b/id/${book.cover_i}-M.jpg`}
                  alt={book.title}
                />
              ) : (
                <p>No cover image available</p>
              )}
              <div className="book-info">
                <h2>{book.title}</h2>
                <p>
                  by{" "}
                  {book.author_name ? book.author_name.join(", ") : "Unknown"}
                </p>
                {book.description && <p>{book.description}</p>}
                <div className="buttons">
                  <button
                    className="seeMore"
                    onClick={() => handleSeeMore(book)}
                  >
                    See more
                  </button>
                  <button className="borrow">Borrow</button>
                </div>
              </div>
            </div>
          </StyledBox>
        ))}
      </StyledBoxWrapper>
      {selectedBook && (
        <BookDetails
          book={selectedBook}
          onClose={() => setSelectedBook(null)}
        />
      )}
    </>
  );
}

const StyledBooksView = styled.h1`
  text-align: center;
  margin: 60px;
`;

const StyledBox = styled.div`
  border: 1px solid black;
  margin: 10px;
  text-align: center;
  width: 17%;

  :hover {
    cursor: pointer;
  }

  .book-image img {
    width: 100%;
  }

  .book-info {
    padding: 20px;
  }

  .buttons {
    width: 100%;
  }

  .seeMore,
  .borrow {
    margin: 3px;
    margin-top: 10px;
    padding: 5px 15px;
  }
`;

const StyledBookDetails = styled.div`
  position: fixed;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background-color: rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: center;
  align-items: center;

  .details-container {
    background-color: white;
    padding: 20px;
    max-width: 800px;
    width: 80%;
    border-radius: 5px;

    .book-image {
      width: 30%;
      margin-right: 20px;

      img {
        width: 100%;
      }
    }

    .book-info {
      width: 70%;

      h2 {
        font-size: 24px;
        margin-bottom: 5px;
      }

      p {
        margin-bottom: 10px;
      }

      .description {
        font-style: italic;
        margin-bottom: 15px;
      }

      button {
        margin-right: 10px;
      }
    }

    .closeBtnModal,
    .borrowBtnModal {
      margin: 3px;
      margin-top: 10px;
      padding: 7px 20px;
    }
  }
`;

function BookDetails({ book, onClose }) {
  return (
    <StyledBookDetails>
      <div className="details-container">
        <div className="book-image">
          {book.cover_i ? (
            <img
              src={`http://covers.openlibrary.org/b/id/${book.cover_i}-M.jpg`}
              alt={book.title}
            />
          ) : (
            <p>No cover image available</p>
          )}
        </div>
        <div className="book-info">
          <h2>{book.title}</h2>
          <p>by {book.author_name ? book.author_name.join(", ") : "Unknown"}</p>
          {book.description && (
            <p className="description">{book.description}</p>
          )}
          <div className="buttons">
            <button className="borrowBtnModal">Borrow</button>
            <button className="closeBtnModal" onClick={onClose}>
              Close
            </button>
          </div>
        </div>
      </div>
    </StyledBookDetails>
  );
}
