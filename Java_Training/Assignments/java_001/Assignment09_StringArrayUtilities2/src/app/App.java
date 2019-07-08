package app;
import arrayutils.ArrUtil;

public class App {

	public static void main(String[] args) {
		String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money","Zoo"};
		boolean found;
		found = ArrUtil.arrayHasExactMatch (myList, "zo", false);
		System.out.println(found);
		found = ArrUtil.arrayHasExactMatch (myList, "zoo", false);
		System.out.println(found);
		found = ArrUtil.arrayHasExactMatch(myList, "zoo", true);
		System.out.println(found);
		
		int[] myArr;
		myArr=ArrUtil.indexOfOccuranceInArray (myList, "zo", false);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=ArrUtil.indexOfOccuranceInArray (myList, "zoo", false);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=ArrUtil.indexOfOccuranceInArray (myList, "zoo", true);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=ArrUtil.indexOfOccuranceInArray (myList, "foo", true);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=ArrUtil.indexOfOccuranceInArray (myList, "foo", false);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=ArrUtil.indexOfOccuranceInArray (myList, "delta", true);
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		myArr=ArrUtil.indexOfOccuranceInArray (myList, "Delta", true);
		for (int i=0;i<myArr.length;i++) {
			System.out.println(myArr[i]+" ");
		}

	}

}
