import java.util.Random;
import java.util.Scanner;

public class TObsurdle {
    public static void main(String[] args) {
        // Import Functions
        Wordlist pintoBeans = new Wordlist();
        Random randVal = new Random();
        Scanner beans = new Scanner(System.in);

        // Boolean Dec. / Variable Dec.
        boolean runtime = true;
        boolean lengthMatch = true;
        int guessNum = 0;

        // Grab a value for the array; Chooses word
        int wordNum = randVal.nextInt(500);
        String chosenWord = pintoBeans.wordsLong[wordNum].toLowerCase();
        char[] cLetters = chosenWord.toCharArray();

        // Output Logic
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" -- -- -- -- -- -- -- ");
        System.out.println("| O| B| S| U| R| D| L|");
        System.out.println(" -- -- -- -- -- -- -- ");
        System.out.println("| E| O| B| S| U| R| D|");
        System.out.println(" -- -- -- -- -- -- -- ");
        System.out.println("| L| E| O| B| S| U| R|");
        System.out.println(" -- -- -- -- -- -- -- ");
        System.out.println("| D| L| E| O| B| S| U|");
        System.out.println(" -- -- -- -- -- -- -- ");
        System.out.println("| R| D| L| E| O| B| S|");
        System.out.println(" -- -- -- -- -- -- -- ");
        System.out.println("| U| R| D| L| E| O| B|");
        System.out.println(" -- -- -- -- -- -- -- ");
        System.out.println("| S| U| R| D| L| E| O|");
        System.out.println(" -- -- -- -- -- -- -- ");
        System.out.println("                ");
        System.out.println("                ");
        System.out.println("Welcome to OBSURDLE.");
        while (runtime) {
            if (!lengthMatch) {
                System.out.println("Your word isn't seven letters long! Please try again!");
                lengthMatch = true;
            }
            System.out.println("The rules are similar to Wordle:");
            System.out.println("You are trying to guess a seven-letter word.");
            System.out.println("You'll be told whether you get a letter correctly guessed by these indicators: □ ■");
            System.out.println("Example Word: Poggers");
            System.out.println("| ■ |   |   |   |   | □ | □ |");
            System.out.println();
            System.out.println("| □ | indicates a right letter, wrong position,");
            System.out.println("| ■ | indicates a right letter, right position,");
            System.out.println("|   | indicates a wrong letter.");
            System.out.println();
            System.out.println("You will get 6 tries to get the word.");
            System.out.println("[Press ENTER to continue]");
            beans.nextLine();
            System.out.println("To begin, guess a 7-letter word.");
            String guess = beans.nextLine();

            // Word Validity
            char[] gLetters = guess.toCharArray();
            if (guess.length() != 7) {
                lengthMatch = false;
            }
            // // Game Logic
            if (lengthMatch) {
                System.out.println(chosenWord);
                for (int i = 0; i < 7; i++) {
                    System.out.println(cLetters[i] + " " + gLetters[i]);
                }
                runtime = false;
            }
            System.out.print("| ");
            System.out.print(check);
            System.out.print(" |");
            // beans.close();
        }
    }
}