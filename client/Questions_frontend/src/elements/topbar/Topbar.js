import "./topbar.css";
import { Link } from "react-router-dom";
import logo from "./Questions-bro.png";
console.log(logo);

export default function TopBar() {
    return (
        <div className="TOPBAR">
             <div className="topCenter">
        <ul className="TopList">
          <li className="TopListItem">Home</li>
          <li className="TopListItem">My Questions</li>
          <li className="TopListItem">Add Question</li>
          <li className="TopListItem">My Account</li>
        </ul>
      </div>
        </div>
    )
}