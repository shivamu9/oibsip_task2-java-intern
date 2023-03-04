import java.util.*;

public class Guess {
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int round = 0;
		int point = 0;
		System.out.println("Rules :\n their are total 5 rounds\n Score 1 point on guessing right number\n choose number between 1 to 100\n Total Guessing chance is 5 in each round");
		for(int j=0; j<3; j++)
		{
	    round++;
	    
	    System.out.println("Round " + round);
		int number = 1 + (int)(100 * Math.random());

		int chance = 10;
		int i, guess;

		for (i = 0; i<chance; i++) {

			System.out.print("Guess the number: ");
			guess = sc.nextInt();

			if (number == guess) {
				System.out.println("Congratulations! You guessed the number.");
				point++;
				break;
			}
			else if (number > guess	&& i != chance - 1) {
				System.out.println("The number is " + "greater than " + guess);
			}
			else if (number < guess	&& i != chance - 1) {
				System.out.println("The number is" + " less than " + guess);
			}
		}
		if (i == chance) {
			System.out.println("You have exhausted"	+ " chance trials.");
			System.out.println("The number was " + number);
		  }
		}
	      System.out.println("x--------------------------------------------x");
	      System.out.println("Total Round :" + round);
      	  System.out.println("Final Score :" + point);
      	  System.out.println("x--------------------------------------------x");
		sc.close();
	}
}
