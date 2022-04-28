import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import styled from "styled-components";
import Header from "./components/Header";
import Home from "./Routes/Home";
import Login from "./Routes/Login";
import Pokedex from "./Routes/Pokedex";
import Profile from "./Routes/Profile";

const Container = styled.div`
  display: flex;
  flex-direction: column;
  height: 100vh;
`;

function App() {
  return (
    <Router>
      <Container>
        <Header />
        <Routes>
          <Route path="/pokedex/:id" element={<Pokedex />} />
          <Route path="/pokedex" element={<Pokedex />} />
          <Route path="/user/:id" element={<Profile />} />
          <Route path="/login" element={<Login />} />
          <Route path="/" element={<Home />} />
        </Routes>
      </Container>
    </Router>
  );
}

export default App;
