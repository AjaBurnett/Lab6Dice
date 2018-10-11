import java.util.Random;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("                          *~*~*Welcome to the Fabulous Grand Circus Casino!!!*~*~*");

		String answer;
		do {

			int x;

			System.out.println("Pick an even numbered die ");

			Scanner in = new Scanner(System.in);

			x = in.nextInt();
			while (x % 2 != 0) {
				System.out.println("No such die. Dice are even numbered. Please pick an even number");
				Scanner in2 = new Scanner(System.in);
				x = in.nextInt();

			}
			

			System.out.print("Your " + x + " sided dice rolled ");

			int abc1= rollDice (x);
			System.out.print(abc1);

			System.out.print(" and  ");

		
			int abc2 = rollDice(x);
			System.out.println(abc2);

			if (abc1 == 1 && abc2 == 1) {
				System.out.println("Snake Eyes!");

				if (abc1 == 6 && abc2 == 6) {
					System.out.println("Boxcars!");

					if (abc1 + abc2 == 7) {
						System.out.println("Craps!");
					}
				}
			}

			System.out.println("Roll again? (y/n)");
			answer = in.next();

		} while (answer.equalsIgnoreCase("y"));

		System.out.println("Thanks for visiting the Grand Circus Casino. Don't forget to tip your server!");

	}
	public static int rollDice (int x) {
		Random random = new Random();
		int abc1 = 1 + random.nextInt(x);
		return abc1;
		
		
		
	}
	
}

