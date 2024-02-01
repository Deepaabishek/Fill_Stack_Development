var message = document.getElementById("message");
var guessInput = document.getElementById("guessnumber");

var randomNumber = Math.floor(Math.random() * 10) + 1;
console.log(randomNumber);

function checkGuess() {
    let guessedNumber = parseInt(guessInput.value);
    if (randomNumber === guessedNumber) {
        message.textContent = "Congratulations! You are right.";
    } else {
        message.textContent = "Try Again.";
    }
}