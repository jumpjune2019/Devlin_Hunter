import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {
		/*
		 * Create 2D array for list. Allow writing to be in the list for each piece
		 * create list then append afterwards
		 * take in an input for every data piece needed
		 * 
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter max number of data you wish to enter");
		int num=input.nextInt();
		String buffer=input.nextLine();
		String[][] data = new String[3][num];
		//boolean to stay true until user wants to leave data entry
		boolean loop=true;
		int count=0;
		
		boolean quickExit=false;
		boolean created=false;
		System.out.println("Do you want to input data into file y for yes n for no");
		try {
			
			BufferedWriter file=new BufferedWriter(new FileWriter("Phone.txt"));
			file.write(String.format("%-10s","Phonebook App"));
			file.append("\r\n");
			file.append(String.format("%-30s","Name"+""));
			file.append(String.format("%-30s","Phone"+""));
			file.append(String.format("%-30s","City"));
			file.append("\r\n");
	
		created=false;
		while(loop) {
			try {
			String answerA=input.nextLine();
			
			if(answerA.equalsIgnoreCase("y")&&quickExit==false) {
				
				if(created) {
					
				}
				else {
					boolean loopB=true;
					
					while(loopB) {
						String check="";
						boolean loopD=true;
						while(loopD) {
							try {
								System.out.print("Input Name");
								System.out.print("\r\n");
								//String filler="";
								//String why=input.nextLine();
								//filler=input.nextLine();
								data[0][count]=input.nextLine();
								dataVerify(data[0][count]);
								check=data[0][count];
								if(!check.equals(null)) {
									loopD=false;
								}
								else {
									System.out.println("try again");
								}
							}
							catch(ArrayEmptyException e) {
								System.out.println("Please enter proper value");
							}
						}
						loopD=true;
						while(loopD) {
							try {
							System.out.println("Input number");
							data[1][count]=input.nextLine();
							dataVerify(data[1][count]);
							check=data[1][count];
							if(!check.equals(null)) {
								loopD=false;
							}
							}
							catch(ArrayEmptyException e){
								System.out.println("Please enter proper value");
							}
							
						}
						loopD=true;
						while(loopD){
							try {
							System.out.println("Input City");
							data[2][count]=input.nextLine();
							dataVerify(data[2][count]);
							check=data[2][count];
							if(!check.equals(null)) {
								loopD=false;
							}
							}
							catch(ArrayEmptyException e) {
								System.out.println("Please enter proper value");
							}
						}
						boolean loopC=true;
						while(loopC) {
							System.out.println("The data you entered is, Name is "+ data[0][count]+", the number is "+data[1][count]+" the city is "+data[2][count]+". Is that correct? Y or N");
							String answerB=input.next();
							if(answerB.equalsIgnoreCase("Y")) {
								loopC=false;
								loopB=false;
								count++;
								System.out.println("Would you like to enter more Data?? Y or N");
								if(count==num){
									System.out.println("You have entered max data, enter a key to exit");
									loopC=false;
									loopB=false;
									quickExit=true;
								}
							}
							else if (answerB.equalsIgnoreCase("N")) {
								loopC=false;
							}
							else {
								System.out.println("Incorrect input");
							}
						}
					}
			}
			
		}
			else if (answerA.equalsIgnoreCase("n")||quickExit==true){
				loop=false;
				dataVerify(data[0][0]);
				for (int i=0;i<count;i++) {
					file.append(String.format("%-30s",data[0][i]));
					//System.out.printf("%-10s",data[0][i]);
					file.append(String.format("%-30s",data[1][i]));
					//System.out.printf("%-10s",data[0][i]);
					file.append(String.format("%-30s",data[2][i]+"\r\n"));
					//System.out.printf("%-10s",data[0][i]+"\r\n");
					file.append("\r\n");
				}
				file.close();
			}
			else {
				System.out.println("Not a valid input");
			}
		}
			catch(ArrayEmptyException e){
				System.out.println("test");
				
				break;
				
				
			}
			}
			
		}
	catch(IOException e) {
		e.printStackTrace();
	}
		
		
		
	}
	public static void dataVerify(String s ) throws ArrayEmptyException{
		if(s.equals("")) {
			throw new ArrayEmptyException("You must have a valid input");
			
		}
		else {
			
		}
		
	}

}



