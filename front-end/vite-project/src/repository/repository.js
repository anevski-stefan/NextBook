import axios from "../axios/axios";

const BookService = {
    fetchCategories: () => {
        return axios.get("/categories");
    },
}

export default BookService;