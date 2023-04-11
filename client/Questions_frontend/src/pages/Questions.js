import Question from "./singleQuestion/Question";

export default function Questions({ questions }) {
    // const renderQuestions = () => questions.map((item) => <SingleQuestion props={item} />);
    const renderQuestions = questions?.map(question => 
        <Question question={question} description={question} />
    );

    return (
        <div className="questions">
            { renderQuestions }
        </div>
    )
}