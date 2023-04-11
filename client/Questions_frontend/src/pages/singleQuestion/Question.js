import "../singleQuestion/question.css";
import photo from "../singleQuestion/Questions-amico.png";

export default function SingleQuestion({ question }) {
  return (
    <div className="question">
      <span className="questionTitle">{ question.title }</span>
        <hr></hr>
         <img className="imgPost" src={ photo } alt="p from post"></img>
         <div className="postInfo">
      </div>
      <p className="description"> { question.description } </p>
      
    </div>
  );
}