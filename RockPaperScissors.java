import java.util.Scanner;
import java.util.Random;

class RockPaperScissors
{
	String userChoice,compChoice;

	RockPaperScissors(String a, String b)
	{
		userChoice = a;
		compChoice = b;
	}

	public static void main(String args[])
	{
		Scanner fp = new Scanner(System.in);

		System.out.println("Enter your choice");
		System.out.println("You can choose between Rock, Paper and Scissors");

		String userChoice = fp.nextLine();
		String compChoice = decideCompChoice();

		RockPaperScissors obj = new RockPaperScissors(userChoice,compChoice);

		System.out.println("You chose -> " + userChoice);
		System.out.println("Computer chose -> " + compChoice);

		obj.result();

	}

	static String decideCompChoice()
	{
		Random ob = new Random();
		int n = ob.nextInt(99);

		if(n<33)
			return "Rock";
		else if(n<66)
			return "Paper";
		else
			return "Scissors";

	}

	void result()
	{	
		if(userChoice.equalsIgnoreCase(compChoice))
			System.out.println("It's a tie");
		else if(userChoice.equalsIgnoreCase("Rock"))
		{
			if(compChoice.equalsIgnoreCase("Scissors"))
				System.out.println("You Win");
			else
				System.out.println("Computer Wins");	
		}
		else if(userChoice.equalsIgnoreCase("Paper"))
		{
			if(compChoice.equalsIgnoreCase("Rock"))
				System.out.println("You Win");
			else
				System.out.println("Computer Wins");
		}
		else if(userChoice.equalsIgnoreCase("Scissors"))
		{
			if(compChoice.equalsIgnoreCase("Paper"))
				System.out.println("You Win");
			else
				System.out.println("Computer Wins");
		}	

	}

}