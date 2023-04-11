import TopBar from "../../elements/topbar/Topbar";
import "../addQuestion/addQuestion.css";
import axios from "axios";
import { useState } from "react";
import Modal from "react-modal";

export default function Register() {
  const [username, setUsername] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [successMessage, setSuccessMessage] = useState("");
  const [errorMessage, setErrorMessage] = useState("");
  const [isModalOpen, setIsModalOpen] = useState(false);

  const handleSubmit = (event) => {
    event.preventDefault();
    const user = {
      name: username,
      password: password,
      email: email,
      tokens: 100,
      badges: 52
    };
    const config = {
      headers: {
        "Content-Type": "application/json"
      }
    };
    axios
      .post("http://localhost:8080/user", user, config)
      .then((response) => {
        setUsername("");
        setEmail("");
        setPassword("");
        setSuccessMessage("Registration successful!");
        setIsModalOpen(true);
      })
      .catch((error) => {
        setUsername("");
        setEmail("");
        setPassword("");
        setErrorMessage("Username or email already taken!");
        setIsModalOpen(true);
      });
  };

  const closeModal = () => {
    setIsModalOpen(false);
    setSuccessMessage("");
    setErrorMessage("");
  };

  return (
    <div className="addQuestionPage">
      <div className="top">
        <TopBar />
      </div>
      <div className="form">
        <form onSubmit={handleSubmit}>
          <label htmlFor="Username">Username:</label>
          <input
            type="text"
            id="username"
            name="username"
            value={username}
            onChange={(event) => setUsername(event.target.value)}
          />
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={email}
            onChange={(event) => setEmail(event.target.value)}
          />
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            name="password"
            value={password}
            onChange={(event) => setPassword(event.target.value)}
          />
          <button type="submit">Register</button>
        </form>
      </div>
      {successMessage && (
        <Modal isOpen={isModalOpen} onRequestClose={closeModal}>
          <h2>{successMessage}</h2>
          <button onClick={closeModal}>Close</button>
        </Modal>
      )}
      {errorMessage && (
        <Modal isOpen={isModalOpen} onRequestClose={closeModal}>
          <h2>{errorMessage}</h2>
          <button onClick={closeModal}>Close</button>
        </Modal>
      )}
    </div>
  );
}
