import { useState, useEffect } from "react";
import "../singleQuestion/question.css";
import photo from "../singleQuestion/Questions-amico.png";

export default function Question({ id }) {
  const [quest, setQuest] = useState({});

  useEffect(() => {
    const fetchData = async () => {
      const response = await fetch(`http://localhost:8080/quest/${id}`);
      const data = await response.json();
      setQuest(data);
    };
    fetchData();
  }, [id]);

  return (
    <div className="question">
      <span className="questionTitle">{quest.title}</span>
      <hr></hr>
      <img className="imgPost" src={photo} alt="p from post"></img>
      <div className="postInfo">
        <span className="postDate">11 April 2023</span>
      </div>
      <p className="description">{quest.description}</p>
    </div>
  );
}
