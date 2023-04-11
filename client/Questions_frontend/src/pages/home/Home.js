import TopBar from "../../elements/topbar/Topbar";
import Questions from "../Questions";
import "../home/home.css";

export default function Home() {
    return (
        <div className="home">
        <div className="top">
             <TopBar></TopBar></div>
    
        <div className="center">
            <Questions></Questions>
        </div>
        </div>

    )
}