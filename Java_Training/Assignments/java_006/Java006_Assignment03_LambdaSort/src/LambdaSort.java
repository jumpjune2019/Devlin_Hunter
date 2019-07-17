
public class LambdaSort {

	public static <T> void main(String[] args) {
		//learn to sort both ways up and down. 
		//create an array
		Lambda str;
		Integer[] numArr = { 10, 3, 4, 15, 7, 9, 1, 21 };
		String[] strArr = { "claude", "Phil", "lois", "clark", "Arthur", "Mera", "bruce" };
		str=(array,accend,igCase,n)->{
			Object temp;
			for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	            	if (array[j] instanceof Integer) {
	            		if (accend==true) {
	            			int c=(int) array[j];
	            			int d=(int) array[j+1];
	            			if(c>d) {
	            				temp=array[j];
	            				array[j]=array[j+1];
	            				array[j+1]=temp;
	            			}
	            		}
	            		else {
	            			int c=(int) array[j];
	            			int d=(int) array[j+1];
	            			if(c<d) {
	            				temp=array[j];
	            				array[j]=array[j+1];
	            				array[j+1]=temp;
	            			}
	            		}
	            	}
	            	
	            	else if(array[j] instanceof String) {
	            		String first=(String) array[j];
	            		String second=(String) array[j+1];
	            		String lfirst=first.toLowerCase();
	            		String lsecond=second.toLowerCase();
	            		char firstC=first.charAt(0);
	            		char lfirstC=lfirst.charAt(0);
	            		char secondC=second.charAt(0);
	            		char lsecondC=lsecond.charAt(0);
	            		if(accend) {
	            			if(igCase) {
	            				if(lfirstC<lsecondC) {
	            					temp=array[j];
	            					array[j]=array[j+1];
	            					array[j+1]=temp;
	            				}
	            			}
	            			else {
	            				if(firstC<secondC) {
	            					temp=array[j];
	            					array[j]=array[j+1];
	            					array[j+1]=temp;
	            				}
	            			}
	            		}
	            		else {
	            			if(igCase) {
	            				if(lfirstC>lsecondC) {
	            					temp=array[j];
	            					array[j]=array[j+1];
	            					array[j+1]=temp;
	            				}
	            			}
	            			else {
	            				if(firstC>secondC) {
	            					temp=array[j];
	            					array[j]=array[j+1];
	            					array[j+1]=temp;
	            				}
	            			}
	            		}
	            	}
	           }
			}
			return array;
			
		};
		str.getValue(numArr,true,false,numArr.length);
		System.out.print("Number ascending: ");
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]+" ");
		}
		
		System.out.println();
		str.getValue(numArr,false,false,numArr.length);
		System.out.print("Number decending: ");
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]+" ");
		}
		System.out.println();
		str.getValue(strArr,false,false,strArr.length);
		System.out.print("String decend follow Case: ");
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		str.getValue(strArr,false,true,strArr.length);
		System.out.print("String decend ignore Case: ");
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		str.getValue(strArr,true,false,strArr.length);
		System.out.print("String accend follow Case: ");
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
		str.getValue(strArr,true,true,strArr.length);
		System.out.print("String accend ignore Case: ");
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
		}
		
		
		 
		
	}
	/*
	static <T> T[] swapArray(T[] array, boolean accend,boolean igCase,int n ) {
		//T obj1=array[spot1];
		//T obj2=array[spot2];
		T temp;
		
		for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
            	if (array[j] instanceof Integer) {
            		if (accend==true) {
            			int c=(int) array[j];
            			int d=(int) array[j+1];
            			if(c>d) {
            				temp=array[j];
            				array[j]=array[j+1];
            				array[j+1]=temp;
            			}
            		}
            		else {
            			int c=(int) array[j];
            			int d=(int) array[j+1];
            			if(c<d) {
            				temp=array[j];
            				array[j]=array[j+1];
            				array[j+1]=temp;
            			}
            		}
            	}
            	
            	else if(array[j] instanceof String) {
            		String first=(String) array[j];
            		String second=(String) array[j+1];
            		String lfirst=first.toLowerCase();
            		String lsecond=second.toLowerCase();
            		char firstC=first.charAt(0);
            		char lfirstC=lfirst.charAt(0);
            		char secondC=second.charAt(0);
            		char lsecondC=lsecond.charAt(0);
            		if(accend) {
            			if(igCase) {
            				if(lfirstC<lsecondC) {
            					temp=array[j];
            					array[j]=array[j+1];
            					array[j+1]=temp;
            				}
            			}
            			else {
            				if(firstC<secondC) {
            					temp=array[j];
            					array[j]=array[j+1];
            					array[j+1]=temp;
            				}
            			}
            		}
            		else {
            			if(igCase) {
            				if(lfirstC>lsecondC) {
            					temp=array[j];
            					array[j]=array[j+1];
            					array[j+1]=temp;
            				}
            			}
            			else {
            				if(firstC>secondC) {
            					temp=array[j];
            					array[j]=array[j+1];
            					array[j+1]=temp;
            				}
            			}
            		}
            	}
           }
		}
		return array;	
	}
	*/
}
