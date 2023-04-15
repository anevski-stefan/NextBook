import "./Landing.css";
import DefaultHeader from "./header/DefaultHeader";
import LHeader from "./header/LHeader";
import Banner from "./main/Banner";
import Books from "./main/Books";
import Footer from "./footer/Footer";
import BookCategories from "./main/BookCategories";

function LandingPage() {
  return (
    <>
      <Banner />
      <Books />
      <BookCategories />
    </>
  );
}

export default LandingPage;
