import java.util.Scanner;

public class PairDiceStats {

	public static void main(String[] args) {
		//tally is for the 21 different combinations
		/*
		 * Combinations for dice game 11 21 22 31 32 33 41 42 43 44 51 52 53 54 55 61 62 63 64 65 66
		 *                            2   3  4  4 5  6   5  6  7  8  6  7  8 9  10  7  8  9  10 11 12
		 *                            2,1 3,1 4,2 5,2 6,2 7,3 8,3, 9,2 10,2 11,1 12,1
		 */
		System.out.println("Press any key to throw a die (or hit q and enter to quit)");
		int[] tally= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		String[] combos= {"1 and 1 ","2 and 1 ","2 and 2 ","3 and 1 ","3 and 2 ","3 and 3 ","4 and 1 ","4 and 2 ",
			"4 and 3 ","4 and 4 ","5 and 1 ","5 and 2 ","5 and 3 ","5 and 4 ","5 and 5 ","6 and 1 ","6 and 2 ","6 and 3 ",
				"6 and 4 ","6 and 5 ","6 and 6 "};
		
		for(int i=0;i<1000;i++){
			diceRoll(tally,combos);
		}
		highNum(tally,combos);
		for(int i=0;i<tally.length;i++) {
			System.out.println(combos[i]+tally[i]);
			
		}
	}
	
	public static int number() {
		int i=(int) Math.ceil((Math.random()*6));
		return i;
	}
	
	public static void diceRoll(int[] tally, String[] combos) {
			int diceA=number();
			int diceB=number();
			diceRoll(diceA,diceB,tally);
			
	}
	public static int diceRoll(int diceA,int diceB, int[] tally) {
		/*
		 * takes in 2 dicerolls find the combo of the 2  
		 */
		int diceSum=diceA+diceB;
		
		if(diceSum==2) {
			tally[0]++;
		}
		else if(diceSum==3) {
			tally[1]++;
		}
		else if(diceSum==4) {
			if(diceA==2) {
				tally[2]++;
			}
			else {
				tally[3]++;
			}
		}
		else if(diceSum==5) {
			if(diceA==3||diceA==2) {
				tally[4]++;
			}
			else {
				tally[6]++;
			}
		}
		else if(diceSum==6) {
			if(diceA==3) {
				tally[5]++;
			}
			else if(diceA==4||diceB==4){
				tally[7]++;
			}
			else {
				tally[10]++;
			}
		}
		else if(diceSum==7) {
			if(diceA==4||diceB==4){
				tally[8]++;
			}
			else if(diceA==5||diceB==5){
				tally[11]++;
			}
			else {
				tally[15]++;
			}
		}
		else if(diceSum==8) {
			if(diceA==4||diceB==4){
				tally[9]++;
			}
			else if(diceA==5||diceB==5){
				tally[12]++;
			}
			else {
				tally[16]++;
			}
		}
		else if(diceSum==9) {
			if(diceA==5||diceB==5){
				tally[13]++;
			}
			else {
				tally[17]++;
			}
		}
		else if(diceSum==10) {
			if(diceA==5||diceB==5){
				tally[14]++;
			}
			else {
				tally[18]++;
			}
		}
		else if(diceSum==11) {
			tally[19]++;
		}
		else if(diceSum==12) {
			tally[20]++;
		}
		else {
			System.out.println("We failed this time boys, we will get 'em next time"+ diceSum);
		}
		return 1;
	}
	public static void highNum(int[] intArr,String[] strArr) {
		//want to make a second array to find the highest number. want to call array into array to print out numbers in order. 
		/*
		 *  String array next to array, when moving one during the sort you move both the string and int array
		 */
		boolean swapped = true;
	    int j = 0;
	    int temp;
	    String sTemp;
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < intArr.length - j; i++) {
	            if (intArr[i] < intArr[i + 1]) {
	                //sort array
	            	temp = intArr[i];
	                intArr[i] = intArr[i + 1];
	                intArr[i + 1] = temp;
	                //sort string array the same way
	                sTemp= strArr[i];
	                strArr[i] = strArr[i + 1];
	                strArr[i + 1] = sTemp;
	                swapped = true;
	            }
	        }
	    
		}
		
	}

}
