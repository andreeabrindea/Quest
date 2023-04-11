import TopBar from "../../elements/topbar/Topbar";
import Questions from "../Questions";
import "../home/home.css";
import { useEffect, useState } from "react";
import { getQuestions } from "../../services/questions";

export default function Home() {
    const [questions, setQuestions] = useState([]);

    useEffect(() => {
        const questionsResponse = async () => {
            setQuestions(await getQuestions());
        }

        questionsResponse().catch(error => console.log(error));
    }, []);

    return (
        <div className="wrapper">
            <div className="top">
                <TopBar></TopBar></div>
            <div className="home">
            <div className="center">
                <Questions questions={questions}/>
                </div>
                </div>
        </div>

    )
}