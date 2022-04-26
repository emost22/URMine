import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Home from "./Routes/Home";
import Login from "./Routes/Login";
import Pokedex from "./Routes/Pokedex";
import Profile from "./Routes/Profile";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/pokedex/:id" element={<Pokedex />} />
        <Route path="/pokedex" element={<Pokedex />} />
        <Route path="/user/:id" element={<Profile />} />
        <Route path="/login" element={<Login />} />
        <Route path="/" element={<Home />} />
      </Routes>
    </Router>
  );
}

export default App;
