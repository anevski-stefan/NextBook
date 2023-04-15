import DefaultHeader from "./components/header/DefaultHeader";
import Footer from "./components/footer/Footer";
import LandingPage from "./components/LandingPage";
import LoginSignUpPage from "./components/LoginSignUpPage";
import BooksPage from "./components/BooksPage";
import BookDetailsPage from "./components/BookDetailsPage";
import UserProfile from "./components/UserProfile";

function App() {
  return (
    <body>
      <div className="App">
        <header className="App-header">
          <DefaultHeader />
          {/* <LHeader /> */}
        </header>
        <main>
          <LandingPage />
          {/* <LoginSignUpPage /> */}
          {/* <BooksPage /> */}
          {/* <UserProfile /> */}
          {/* <BookDetailsPage /> */}
        </main>
        <footer>
          <Footer />
        </footer>
      </div>
    </body>
  );
}

export default App;
