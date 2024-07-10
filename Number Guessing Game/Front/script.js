// script.js
function checkGuess() {
    const generatedNumber = /* Get the generated number from your backend */;
    const userGuess = parseInt(document.getElementById('userGuess').value);

    if (userGuess === generatedNumber) {
        document.getElementById('result').textContent = 'Congratulations! You guessed it right!';
    } else if (userGuess < generatedNumber) {
        document.getElementById('result').textContent = 'Guess higher.';
    } else {
        document.getElementById('result').textContent = 'Guess lower.';
    }
}
