import java.util.Scanner;

public class HeadOrTail {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=" ";
		LammyDammy publicMain=(num)->{
			if(num==1) {
				return "The coin flip is Head";
			}
			else if(num==2) {
				return "The coin flip is Tails";
			}
			else {
				return "not working";
			}
		};
		System.out.println("Welcome to the coin game. Push F to start");
		while (!s.equalsIgnoreCase("q")) {
			s=input.nextLine();
			if(!s.equalsIgnoreCase("q")) {
				System.out.println(publicMain.getValue((number())));
				System.out.println("Push q to quit");
			}
			
		}
	}
	
	public static int number() {
		Lambda test=()->(int) Math.ceil((Math.random()*2));
		return test.getValue();
		
	}
	/*
	static String value(int num) {
		if(num==1) {
			return "The coin flip is Head";
		}
		else if(num==2) {
			return "The coin flip is Tails";
		}
		else {
			return "not working";
		}
	}
	*/
}
