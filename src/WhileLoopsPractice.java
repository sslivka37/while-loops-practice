
import java.util.Scanner;

public class WhileLoopsPractice {

	public static void main(String[] args) {

		// looping practice

		Scanner input = new Scanner(System.in);

		// while loop
		System.out.println("Enter a number");
		int numberInput = Integer.parseInt(input.nextLine());
		int beginCount = 0;

		while (beginCount <= numberInput) {
			System.out.println(beginCount);
			beginCount++;
		}
		System.out.println("I just counted to " + numberInput + "!");

		// ask for a number, then count to that number in evens starting from zero, and
		// output the number of iterations
		System.out.println("Enter a number");
		int numberInputTwo = Integer.parseInt(input.nextLine());
		int beginCountTwo = 0;

		while (beginCountTwo <= numberInputTwo) {
			System.out.println(beginCountTwo);
			beginCountTwo += 2;
		}

		// so we have an option for an even or odd number here, so we have to make
		// conditions for outputs based on %2
		if (numberInputTwo % 2 == 1) {
			System.out.println("I counted " + ((numberInputTwo + 1) / 2) + " even numbers!");
		} else {
			System.out.println("I counted " + ((numberInputTwo / 2) + 1) + " even numbers!");
		}

		// ask user for PIN, if they get it wrong give error and try again, if correct
		// display message, give three attempts to shut down
		System.out.println("Enter three digit PIN");
		int guessPIN = input.nextInt();
		int count = 1;

		while (guessPIN != 123) {
			System.out.println("Incorrect, try again:");
			guessPIN = input.nextInt();
			count++;

			// this gives the condition that on the third try and wrong answer, system exits
			if (count == 3 && guessPIN != 123) {
				System.out.println("Too many incorrect tries, system exit");
				System.exit(0);
			}
		}

		System.out.println("Correct PIN Entered!");

		// ask for integer, then add all numbers from integer plus inputInteger

		System.out.println("Enter an integer between 1 and 10");
		int numberInputThree = input.nextInt();
		// where sum starts (0)
		int sum = 0;

		// where count starts (1)
		int countAdd = 1;

		while (countAdd <= numberInputThree) {

			// this is saying sum = sum + count, must come before incrementing count
			sum += countAdd;

			// here we are incrementing the count
			countAdd++;
		}

		System.out.println(sum);

		// now to try that again with a user inputting a low int and a high int
		System.out.println("Enter a low integer between 1 and 10");
		int lowInt = input.nextInt();
		System.out.println("Enter a high integer between 1 and 10");
		int highInt = input.nextInt();
		int sumLowHigh = 0;

		// this throws an error if the low int is greater than the high int
		if (lowInt > highInt) {
			System.out.println("Error, low integer must be lower or equal to high integer");
			System.exit(0);
		}

		while (lowInt <= highInt) {

			sumLowHigh += lowInt;
			lowInt++;

		}

		System.out.println(sumLowHigh);
		
		input.nextLine();

		System.out.println("Enter a username that's at least 4 characters");
		String userName = input.nextLine();
		int userNameLength = userName.length();
		int tryAttempts = 0;

		while (userNameLength < 4) {
			if (tryAttempts == 0) {
				System.out.println("Username not long enough, try again!");
				userName = input.nextLine();
				userNameLength = userName.length();
				tryAttempts++;

			} else {
				System.out.println("Still not long enough, try again!");
				userName = input.nextLine();
				userNameLength = userName.length();
			}

		}

		System.out.println("Welcome,  " + userName);

		input.close();

	}

}
