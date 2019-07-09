import java.io.*;

public class Compare {

	public static void main(String[] args) {
		/*
		 * File to compare two files
		 * Reads files in
		 * Compares files line by line (while counting the lines of both)
		 * says if they match or if they do not match and the number of characters in each
		 */
		//creates file to find to read from
		File firstFile=new File ("File.txt");
		File secFile=new File ("File2.txt");
		try {
			//reads from file
			BufferedReader readerA=new BufferedReader(new FileReader(firstFile));
			BufferedReader readerB=new BufferedReader(new FileReader(secFile));
			int countA=0;
			int countB=0;
			int inputA;
			int inputB;
			
			int trueCount=0;
			//two while loops to count through file if numbers are different 
			//good else go line by line to see if they are the same
			
			while((inputA=readerA.read()) !=-1) {
				countA++;
			}
			while((inputB=readerB.read()) !=-1) {
				countB++;
			}
			BufferedReader readerC=new BufferedReader(new FileReader(firstFile));
			BufferedReader readerD=new BufferedReader(new FileReader(secFile));
			int lineRead=readerC.read();
			int lineRead2=readerD.read();
			
			  if(countA==countB) {
				
				int testA;
				int testB;
				while(lineRead!=-1 && lineRead2 !=-1) {
					if(lineRead!=lineRead2){
						break;
					}
					else {
						lineRead=readerC.read();
						lineRead2=readerD.read();
						trueCount++;
					}
				}
				
				
				if(trueCount==countA) {
					System.out.println("Same Content");
					System.out.println("Both files have "+ countA+ " characters");
				}
				else {
					System.out.println("Different Content");
					System.out.println("Both files have "+ countA+ " characters");
				}
				
			}
			else {
				System.out.println("Different Content");
				System.out.println("The first file has "+ countA+ " characters");
				System.out.println("The Second file has "+ countB+ " characters");
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
