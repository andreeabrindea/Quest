import './App.css';
import Home from './pages/home/Home';
import AddQuestion from './pages/addQuestion/AddQuestion';
import Register from './pages/register/Register';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Question from './pages/singleQuestion/Question'
function App() {
  return (
    <Router>
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/register" element={<Register />} />
      <Route path="/addquestion" element={<AddQuestion />} />
      <Route path="/question/:id" element={<Question />} />
    </Routes>
  </Router>

  );
}

export default App;
