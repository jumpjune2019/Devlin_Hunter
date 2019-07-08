
public class StringArrayUtilities {

	public static void main(String[] args) {
		String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money","Zoo"};
		boolean found;
		found = arrayHasExactMatch (myList, "zo", false);
		System.out.println(found);
		found = arrayHasExactMatch (myList, "zoo", false);
		System.out.println(found);
		found = arrayHasExactMatch(myList, "zoo", true);
		System.out.println(found);
		
		int[] myArr;
		myArr=indexOfOccuranceInArray (myList, "zo", false);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=indexOfOccuranceInArray (myList, "zoo", false);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=indexOfOccuranceInArray (myList, "zoo", true);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=indexOfOccuranceInArray (myList, "foo", true);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=indexOfOccuranceInArray (myList, "foo", false);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=indexOfOccuranceInArray (myList, "delta", true);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=indexOfOccuranceInArray (myList, "Delta", true);
		for (int i=0;i<myArr.length;i++) {
			System.out.println(myArr[i]+" ");
		}
		
		
		
	}
	public static boolean arrayHasExactMatch(String[] stArr,String str,boolean cap) {
		/*
		 * Checks to see if the match needs to be case sensitive
		 * then checks the strings against the array
		 * returns true if it matches and false otherwise
		 */
		if (cap==true) {
			for (int i=0;i<stArr.length;i++) {
				if (str.equals(stArr[i])) {
					
					return true;
				}
				else {};
			}
			return false;
			
		}
		else {
			for (int i=0;i<stArr.length;i++) {
				if(str.equalsIgnoreCase(stArr[i])) {
					return true;
				}
			}
			return false;
		}
	}
	
	public static int[] indexOfOccuranceInArray(String[] stArr,String str,boolean cap) {
		//make a for loop, return i as the index. cant use return, find out how to save multiple 
		//values and store the numbers.  run array once to find the number of occurances save number make new 
		//array with number of occurances run again with the correct array length size and store the positions and 
		//return an int array. Find out how to return an array. Start loop at 1 run loop then add more later x-1 
		//always initialize starting with -1 if more are available overwrite -1.
		int occourNum=0;
		
		if(arrayHasExactMatch(stArr,str,cap)) {
			if (cap==true) {
				for (int i=0;i<stArr.length;i++) {
					if (str.equals(stArr[i])) {
						occourNum++;
					}
					else {};
				}				
			}
			else {
				for (int i=0;i<stArr.length;i++) {
					if(str.equalsIgnoreCase(stArr[i])) {
						occourNum++;
					}
				}
			}
			//initialze an array length of number
			int[] locArr=new int[occourNum];
			int count=0;
			if (cap==true) {
				for (int i=0;i<stArr.length;i++) {
					if (str.equals(stArr[i])) {
						locArr[count]=i;
						count++;
					}
					else {};
				}				
			}
			else {
				for (int i=0;i<stArr.length;i++) {
					if(str.equalsIgnoreCase(stArr[i])) {
						locArr[count]=i;
						count++;
					}
				}
			}
			return locArr;
		}
		else {
			int[] nullArr= {-1};
			return nullArr;
		}
	}
	

}
