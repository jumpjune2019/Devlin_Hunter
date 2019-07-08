import java.util.Scanner;

public class SimpleDie {
	public static void main(String[] args) {
		System.out.println("Press any key to throw a die (or hit q and enter to quit");
		Scanner input= new Scanner(System.in);
		String answer=input.nextLine();
		boolean play=true;
		while(play==true){
			play=diceRoll(answer);
		}
	}
	public static int number() {
		int i=(int) Math.ceil((Math.random()*6));
		return i;
	}
	public static boolean diceRoll(String answer) {
		if(!answer.equalsIgnoreCase("q")) {
			System.out.println("Your dice roll is "+ number());
			System.out.println("Do you want to play again? Y or y and enter to play again");
			Scanner input= new Scanner(System.in);
			String secAns=input.nextLine();
			if (secAns.equalsIgnoreCase("y")) {
				return true;
			}
			else return false;
		}
		else {
			//exit game
			return false;
		}
		
	}
}
