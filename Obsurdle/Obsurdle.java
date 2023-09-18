import java.util.Scanner;

public class Obsurdle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean repeat = false;
		int maxTries=7;
		while(repeat=true) {
			int tries = 0;
			while(tries<maxTries) {
				int triesLeft = maxTries-tries;
				String word = "Seventy";
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
				System.out.println("To begin, guess a 7-letter word.");
				System.out.println("Your output will be in the form of a string of 7 numbers.");
				System.out.println("1: right letter, right position.");
				System.out.println("2: right letter, wrong position.");
				System.out.println("3: The letter is not contained in the word.");
				String guess = sc.nextLine();
				tries += 1;
				System.out.println("Here's how you did: 1322123");
				System.out.println("You have " + tries + " tries left.");
			}
		}
	}
}