import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"java", "python", "hangman", "programming", "developer"};
        String word = words[(int) (Math.random() * words.length)];
        char[] guessedWord = new char[word.length()];
        Arrays.fill(guessedWord, '_');
        int attempts = 6;
        boolean wordGuessed = false;

        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the word:");
        printGuessedWord(guessedWord);

        while (attempts > 0 && !wordGuessed) {
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);
            boolean correctGuess = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attempts--;
                System.out.println("Wrong guess! Attempts left: " + attempts);
            }

            wordGuessed = word.equals(new String(guessedWord));
            printGuessedWord(guessedWord);
        }

        if (wordGuessed) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("You lost! The word was: " + word);
        }

        scanner.close();
    }

    public static void printGuessedWord(char[] guessedWord) {
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}



/*
How it works:
The game randomly selects a word from a predefined list.
The player guesses letters to reveal the hidden word.
If the guessed letter is in the word, it is revealed in the correct position(s).
The player has 6 attempts to guess the word before losing.
The game ends when the player guesses the word correctly or runs out of attempts.
The game displays a message if the player wins or loses, along with the correct word.*/
