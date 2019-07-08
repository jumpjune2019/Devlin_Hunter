
public class HeadOrTail {
	public static void main(String[] args) {
		System.out.println(value(number()));

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
