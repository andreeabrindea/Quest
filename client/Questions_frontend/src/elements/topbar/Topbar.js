import "./topbar.css";
import { Link } from "react-router-dom";
import logo from "./Questions-bro.png";
console.log(logo);

export default function TopBar() {
    return (
        <div className="TOPBAR">
             <div className="topCenter">
        <ul className="TopList">
          <li className="TopListItem"><Link
              className="link"
              to="/"
              style={{ textDecoration: "none", color: "inherit" }}
            >Home</Link></li>
          <li className="TopListItem"><Link
              className="link"
              to="/addquestion"
              style={{ textDecoration: "none", color: "inherit" }}
            >Add Question</Link></li>
          <li className="TopListItem"><Link
              className="link"
              to="/addquestion"
              style={{ textDecoration: "none", color: "inherit" }}
            >Register</Link></li>
        </ul>
      </div>
        </div>
    )
}