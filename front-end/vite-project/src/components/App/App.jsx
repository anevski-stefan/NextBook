import React from "react";
import Category from "../Category/categories";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import BookService from "../../repository/repository";
import { Suspense } from "react";
import { Header } from "../Header/Header";
import { BookRecommendation } from "../BookRecommendation/BookRecommendation";
import { Footer } from "../Footer/Footer";
import { BooksView } from "../BooksView/BooksView";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      books: [],
      categories: [],
      authors: [],
      currentBook: {},
    };
  }
  render() {
    return (
      <Router>
        <Header />
        <Suspense fallback={<div>Loading...</div>}>
          <Routes>
            <Route
              path="/"
              element={
                <>
                  <BookRecommendation />
                  <Category categories={this.state.categories} />
                </>
              }
            />

            <Route
              path="/books"
              element={
                <>
                  <BooksView />
                </>
              }
            />
          </Routes>
        </Suspense>
        <Footer />
      </Router>
    );
  }
  loadCategories = () => {
    BookService.fetchCategories().then((resp) => {
      this.setState({
        categories: resp.data,
      });
    });
  };
  componentDidMount() {
    this.loadCategories();
  }
}

export default App;
