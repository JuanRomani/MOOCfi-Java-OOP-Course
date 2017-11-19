
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    private int i = 0;
    private String c;
    private String hidden = "";

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return numberOfFaults;
    }

    public String guessedLetters() {
        return guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters

        if (!guessedLetters.contains(letter)){
            if (!(word.contains(letter))){
                numberOfFaults++;
            }
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed letters, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word

        // return the hidden word at the end

        while (i <= (word.length() - 1)){
            c = "" + word.charAt(i);
            if (guessedLetters.contains(c)){
                hidden += c;
            }else {
                hidden += "_";
            }
            i++;
        }
        return hidden;
    }
}