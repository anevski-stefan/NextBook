import * as React from "react";
import DefaultHeader from "./header/DefaultHeader";
import Footer from "./footer/Footer";
import Box from "@mui/material/Box";
import Card from "@mui/material/Card";
import CardMedia from "@mui/material/CardMedia";
import CardContent from "@mui/material/CardContent";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";
import { Container, InputAdornment, TextField } from "@mui/material";
import { useState } from "react";
import SearchIcon from "@mui/icons-material/Search";
import Grid from "@mui/material/Grid";

export default function BooksPage() {
  const [searchTerm, setSearchTerm] = useState("");

  const handleChange = (event) => {
    setSearchTerm(event.target.value);
  };

  const bookCard = (
    <Box
      sx={{
        flexGrow: 1,
        width: "100vw",
        color: "grey",
        margin: 10,
      }}
    >
      <Card variant="outlined" sx={{ width: "30vw" }}>
        <CardContent>
          <CardMedia
            sx={{ height: "20vh", align: "center" }}
            image="https://tse4.mm.bing.net/th?id=OIP.2bJ9_f9aKoGCME7ZIff-ZwHaJ4"
          />
          <Typography variant="body2">
            {"Book Title"} <br /> {"Category: "}
            <br /> {"Book description: "}
          </Typography>
        </CardContent>
        <Grid container justifyContent="space-evenly">
          <Button variant="outlined" color="inherit" size="small">
            Learn More
          </Button>
          <Button variant="outlined" color="inherit" size="small">
            Borrow
          </Button>
        </Grid>
      </Card>
    </Box>
  );
  return (
    <>
      <Typography sx={{ mt: 5 }} variant="h3" align="center" color="grey">
        Books
      </Typography>
      <Container sx={{ mt: 5 }} align="center">
        <TextField
          id="search"
          type="search"
          label="Search up a Book"
          value={searchTerm}
          onChange={handleChange}
          sx={{ width: 600 }}
          InputProps={{
            endAdornment: (
              <InputAdornment position="end">
                <SearchIcon />
              </InputAdornment>
            ),
          }}
        />
      </Container>
      {bookCard}
      <Box align="center">
        <Button variant="outlined" color="inherit" size="small">
          Load more books
        </Button>
      </Box>
      s
    </>
  );
}
