import { useState, useEffect } from "react";
import "./submission.css";

export default function Submission() {
    const [submissions, setSubmissions] = useState([]);

    useEffect(() => {
        async function fetchData() {
            const response = await fetch("http://localhost:8080/submissions");
            const data = await response.json();
            setSubmissions(data);
        }

        fetchData();
    }, []);

    return (
        <div className="submission">
            {submissions.map((submission) => (
                <div key={submission.submissionId}>
                    <div className="userName"> <p>UserName: {submission.userId}</p></div>
                    <div className="comment"><p>Comment: {submission.details}</p></div>
                    <div className="time"><p>Time: {submission.time}</p></div>
                </div>
            ))}
        </div>
    )
}
