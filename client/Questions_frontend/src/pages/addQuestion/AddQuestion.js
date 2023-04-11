import TopBar from "../../elements/topbar/Topbar";
import "../addQuestion/addQuestion.css";
import axios from "axios";

export default function AddQuestion() {
  const handleSubmit = async (event) => {
    event.preventDefault();
    const title = event.target.title.value;
    const description = event.target.description.value;
    const creatorId = event.target.name.value;

    // Make a request to get the username based on the creatorId
    const response = await axios.get(`http://localhost:8080/users/52`);
    const name = response.data.name;

    // Create the new Quest object with the username
    const newQuest = {
      title: title,
      description: description,
      creatorId: 52,
      fee: 5
    };
    const config = {
        headers: {
          'Content-Type': 'application/json'
        }
      };
      
      try {
        await axios.post("http://localhost:8080/quest", newQuest, config);
      } catch (error) {
        console.error(error);
      }

  };

  return (
    <div className="addQuestionPage">
      <div className="top">
        <TopBar />
      </div>
      <div className="form">
        <form onSubmit={handleSubmit}>
          <label htmlFor="title">Title:</label>
          <input type="text" id="title" name="title" />
          <label htmlFor="description">Description:</label>
          <input type="text" id="description" name="description" />
          <label htmlFor="name">Username:</label>
          <input type="text" id="name" name="name"/>
          <button type="submit">Post it</button>
        </form>
      </div>
    </div>
  );
}
