import SingleQuestion from "./singleQuestion/Question";

export default function Questions({ questions }) {
    // const renderQuestions = () => questions.map((item) => <SingleQuestion props={item} />);
    const renderQuestions = questions?.map(question => 
        <SingleQuestion question={question} description={question} />
    );

    return (
        <div className="questions">
            { renderQuestions }
        </div>
    )
}