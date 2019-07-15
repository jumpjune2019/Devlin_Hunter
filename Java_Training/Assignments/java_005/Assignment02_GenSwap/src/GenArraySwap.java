
public class GenArraySwap {

	public static void main(String[] args) {
		Integer[] num= {1,2};
		for(int i=0;i<2;i++) {
			System.out.println(num[i]);
		}
		swapArray(num,0,1);
		for(int i=0;i<2;i++) {
			System.out.println(num[i]);
		}
		String[] text= {"This","Swap"};
		for(int i=0;i<2;i++) {
			System.out.println(text[i]);
		}
		swapArray(text,0,1);
		for(int i=0;i<2;i++) {
			System.out.println(text[i]);
		}
		
		
		
	}
	
	static <T> T[] swapArray(T[] array, int spot1, int spot2 ) {
		T obj1=array[spot1];
		T obj2=array[spot2];
		T temp;
		
		temp=obj1;
		obj1=obj2;
		obj2=temp;
		
		array[spot1]=obj1;
		array[spot2]=obj2;
		return array;
		
	}

}
