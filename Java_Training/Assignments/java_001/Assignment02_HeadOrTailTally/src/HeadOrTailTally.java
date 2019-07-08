
public class HeadOrTailTally {
	public static void main(String[] args) {
		int[] num= {0,0};
		
		//loop to assign array
		for (int i=0;i<1000; i++) {
			int flip=number();
			if(flip==1) {
				num[0]+=1;
			}
			else if (flip==2) {
				num[1]+=1;
			}
			else
				System.out.println(number());
		}
		System.out.println("1000 Coin Flips");
		System.out.println("Heads "+ num[0]+ "times");
		System.out.println("Tails "+ num[1]+ "times");
		
		

	}
	public static int number() {
		int i=(int) Math.ceil((Math.random()*2));
		return i;
	}

	static String value(int num) {
		if(num==1) {
			return "head";
		}
		else if(num==2) {
			return "tails";
		}
		else {
			return "not working";
		}
	}
}
