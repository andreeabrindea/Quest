import axios from 'axios';

export const getQuestions = async () => {
    const response = await axios('http://localhost:8080/quests', {
        method: 'GET'
    });
    if (response.status >= 400) {
        console.log(response.text());
    }
    return response.data;
}