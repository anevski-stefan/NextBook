# NextBook

NextBook is a free online platform that connects people within the community who share a common love for knowledge sharing. The idea behind NextBook is simple: sign up to the platform, lend a book out, and borrow a book to gain affordable, accessible education.

This project was developed as part of Mega Hackathon 2023.

## Features

- Integration with OpenLibrary API for comprehensive book data
- Category management with PostgreSQL Database
- Interactive book detail popups
- Responsive and modern user interface
- User-friendly book browsing experience

## Technologies Used

NextBook is built using modern web technologies:

### Frontend
- React 18 with Vite for fast development and optimal production builds
- React Router (v6) for seamless navigation
- Styled-components for component-based styling
- Axios for API communication

### Backend
- Spring Boot for robust backend services
- PostgreSQL for reliable data storage
- RESTful API architecture

## Getting Started

To run NextBook locally, follow these steps:

### Frontend Setup
1. Navigate to the frontend directory:
   ```bash
   cd front-end/vite-project
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm run dev
   ```
4. Access the application at `http://localhost:5173`

### Backend Setup
1. Ensure you have Java 11+ and PostgreSQL installed
2. Configure your database connection in the application properties
3. Run the Spring Boot application

## Feature Roadmap

- User authentication and authorization
- Book lending and borrowing system
- Advanced search functionality (by title, author, genre)
- User profile management
- Borrowing history tracking
- Book ratings and reviews
- Administrative dashboard for platform analytics

## Contributing

We welcome contributions to NextBook! Please feel free to submit issues and pull requests.

## License

This project is licensed under the [MIT License](./LICENSE) - see the [LICENSE](./LICENSE) file for details.
