import "../singleQuestion/question.css";
import photo from "../singleQuestion/Questions-amico.png";
console.log(photo);

export default function SingleQuestion() {
  return (
    <div className="question">
      <span className="questionTitle">Title</span>
        <hr></hr>
         <img className="imgPost" src={photo} alt="p from post"></img>
         <div className="postInfo">
        <span className="postDate">11 April 2023</span>
      </div>
      <p className="description">
        Lorem ipsum dolor, sit amet consectetur adipisicing elit. Minus ex
        blanditiis non similique? Reprehenderit excepturi cupiditate,
        voluptatibus sit quae suscipit perspiciatis vitae autem nobis alias
        velit ea delectus? Commodi, officia.
      </p>
    </div>
  );
}