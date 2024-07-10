// server.js
const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());

app.post('/process', (req, res) => {
    const generatedNumber = /* Generate a random number (1-100) */;
    const userGuess = req.body.guess;

    if (userGuess === generatedNumber) {
        res.json({ message: 'Congratulations! You guessed it right!' });
    } else if (userGuess < generatedNumber) {
        res.json({ message: 'Guess higher.' });
    } else {
        res.json({ message: 'Guess lower.' });
    }
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});
