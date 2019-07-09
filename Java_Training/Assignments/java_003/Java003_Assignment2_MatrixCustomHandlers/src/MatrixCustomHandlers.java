import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
public class MatrixCustomHandlers {
	


		public static void main(String[] args) {
			
			String[][] arrayX= new String[6][6];
			setArray(arrayX);
			System.out.println("How do you want the matrix printed out?");
			System.out.println("1) File");
			System.out.println("2) Console");
			System.out.println("3) Both");
			Scanner input=new Scanner(System.in);
			String num=input.nextLine();
			try {
				verify(num);
				if(num.equals("1")) {
					try {
					BufferedWriter file=new BufferedWriter(new FileWriter("Matrix.txt"));
					file.write(String.format("%-10s","-"));
					for (int i=1; i<7;i++) {
						//makes sure that the die is never less than 1 or higher than 7
						dieVerify(i);
						file.append(String.format("%-30s","Dice "+i));
					}
						file.append("\r\n");
						file.append(String.format("%-10s","Dice 1"));
						for(int j=0;j<6;j++) {
							file.append(String.format("%-30s",arrayX[0][j]+"        "));
						}
						file.append("\r\n");
						file.append(String.format("%-10s","Dice 2"));
						for(int j=0;j<6;j++) {
							file.append(String.format("%-30s",arrayX[1][j]+"        "));
						}
						file.append("\r\n");
						file.append(String.format("%-10s","Dice 3"));
						for(int j=0;j<6;j++) {
							file.append(String.format("%-30s",arrayX[2][j]+"        "));
						}
						file.append("\r\n");
						file.append(String.format("%-10s","Dice 4"));
						for(int j=0;j<6;j++) {
							file.append(String.format("%-30s",arrayX[3][j]+"        "));
						}
						file.append("\r\n");
						file.append(String.format("%-10s","Dice 5"));
						for(int j=0;j<6;j++) {
							file.append(String.format("%-30s",arrayX[4][j]+"        "));
						}
						file.append("\r\n");
						file.append(String.format("%-10s","Dice 6"));
						for(int j=0;j<6;j++) {
							file.append(String.format("%-30s",arrayX[5][j]+"        "));
						}
					file.close();	
					}
					catch (IOException|InvalidDieException e ) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
					
				
				else if(num.equals("2")) {
					System.out.printf("%-10s","-");
					try {
					for (int i=1; i<7;i++) {
						dieVerify(i);
						System.out.printf("%-30s","Dice "+i);
					}
						System.out.println();
						System.out.printf("%-10s","Dice 1");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[0][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 2");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[1][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 3");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[2][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 4");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[3][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 5");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[4][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 6");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[5][j]+"        ");
						}
					}
					catch(InvalidDieException e) {
						e.printStackTrace();
					}
				}
				else if(num.equals("3")) {
					System.out.printf("%-10s","-");
					try {
					for (int i=1; i<7;i++) {
						dieVerify(i);
						System.out.printf("%-30s","Dice "+i);
					}
						System.out.println();
						System.out.printf("%-10s","Dice 1");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[0][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 2");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[1][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 3");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[2][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 4");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[3][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 5");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[4][j]+"        ");
						}
						System.out.println();
						System.out.printf("%-10s","Dice 6");
						for(int j=0;j<6;j++) {
							System.out.printf("%-30s",arrayX[5][j]+"        ");
						}
					}
					catch(InvalidDieException e) {
						e.printStackTrace();
					}
						try {
							BufferedWriter file=new BufferedWriter(new FileWriter("Matrix.txt"));
							file.write(String.format("%-10s","-"));
							for (int i=1; i<7;i++) {
								//makes sure that the die is never less than 1 or higher than 7
								dieVerify(i);
								file.append(String.format("%-30s","Dice "+i));
							}
								file.append("\r\n");
								file.append(String.format("%-10s","Dice 1"));
								for(int j=0;j<6;j++) {
									file.append(String.format("%-30s",arrayX[0][j]+"        "));
								}
								file.append("\r\n");
								file.append(String.format("%-10s","Dice 2"));
								for(int j=0;j<6;j++) {
									file.append(String.format("%-30s",arrayX[1][j]+"        "));
								}
								file.append("\r\n");
								file.append(String.format("%-10s","Dice 3"));
								for(int j=0;j<6;j++) {
									file.append(String.format("%-30s",arrayX[2][j]+"        "));
								}
								file.append("\r\n");
								file.append(String.format("%-10s","Dice 4"));
								for(int j=0;j<6;j++) {
									file.append(String.format("%-30s",arrayX[3][j]+"        "));
								}
								file.append("\r\n");
								file.append(String.format("%-10s","Dice 5"));
								for(int j=0;j<6;j++) {
									file.append(String.format("%-30s",arrayX[4][j]+"        "));
								}
								file.append("\r\n");
								file.append(String.format("%-10s","Dice 6"));
								for(int j=0;j<6;j++) {
									file.append(String.format("%-30s",arrayX[5][j]+"        "));
								}
							file.close();	
							}
							catch (IOException |InvalidDieException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				}
				else {	
				}
			}
			catch(InvalidInputException e){
				e.printStackTrace();
				
			}
			
			
		}

			
		public static void setArray(String[][] arrayX) {
			arrayX[0][0]="Snake Eyes";
			arrayX[0][1]="Australian Yo";
			arrayX[0][2]="Little Joe From Kokomo";
			arrayX[0][3]="No Field Five";
			arrayX[0][4]="Easy Six";
			arrayX[0][5]="Six one you're done";
			arrayX[1][0]="Ace caught a deuce";
			arrayX[1][1]="Ballerina";
			arrayX[1][2]="The fever";
			arrayX[1][3]="Jimmie Hicks";
			arrayX[1][4]="Benny Blue";
			arrayX[1][5]="Easy eight";
			arrayX[2][0]="Easy four";
			arrayX[2][1]="OJ";
			arrayX[2][2]="Brooklyn Forest";
			arrayX[2][3]="Big red";
			arrayX[2][4]="Eighter from Decatur";
			arrayX[2][5]="Nina from Pasadena";
			arrayX[3][0]="Little Phoebe";
			arrayX[3][1]="Easy six";
			arrayX[3][2]="Skinny McKinney";
			arrayX[3][3]="Square pair";
			arrayX[3][4]="Railroad nine";
			arrayX[3][5]="Big one on the end";
			arrayX[4][0]="Sixie from Dixie";
			arrayX[4][1]="Skinny Dugan";
			arrayX[4][2]="Easy eight";
			arrayX[4][3]="Jesse James";
			arrayX[4][4]="Puppy Paws";
			arrayX[4][5]="Yo";
			arrayX[5][0]="The Devil";
			arrayX[5][1]="Easy eight";
			arrayX[5][2]="Lou Brown";
			arrayX[5][3]="Tennessee";
			arrayX[5][4]="Six five no jive";
			arrayX[5][5]="Midnight";
		}
		public static void verify(String num) throws InvalidInputException{
			if(num.equals("3")||num.equals("1")||num.equals("2")) {
				
			}
			else {
				throw new InvalidInputException("not valid");
			}
			
		}
		public static void dieVerify(int num) throws InvalidDieException{
			if(num==3||num==1||num==2||num==4||num==5||num==6) {
				
			}
			else {
				throw new InvalidDieException("Can't roll that on a die");
			}
			
		}
}
