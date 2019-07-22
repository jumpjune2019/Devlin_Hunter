import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GameOfDie {

	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {
		
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel panel1 = new JPanel();
		//JLabel lab = new JLabel(label);
		panel1.setLayout(new FlowLayout());
		ButtonDemo bd = new ButtonDemo();
		bd.setButtons(panel1, "ClickToRoll", "Reset", "Waiting", "Waiting...");
		frm.add(panel1);
		//frm.add(lab);
		return frm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		SwingUtilities.invokeLater(new Runnable() {
			SwingDemo demo;
			JFrame frm;
			public void run() {
				
				
				demo = new SwingDemo("Demo 1");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 1000, 100, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
				
			}
		});
	}
	public static int number() {
		Lambda test=()->(int) Math.ceil((Math.random()*6));
		return test.getValue();
	}
	public static String diceRoll(String answer, String[][] arrayX) {
		if(!answer.equalsIgnoreCase("q")) {
			int diceA=number();
			int diceB=number();
			int pcSum=diceA+diceB;
			int diceC=number();
			int diceD=number();
			int cpSum=diceC+diceD;
			String a="Rolling the dice. ";
			String b="You have rolled "+diceA+" and "+ diceB+"> the " +arrayX[diceA-1][diceB-1];
			String c=". I have rolled "+diceC+" and "+ diceD+"> the " +arrayX[diceC-1][diceD-1]+"\r\n";
			if(pcSum==cpSum){
				if(diceA==diceB) {
					if(diceC==diceD) {
						String d=" Stalemate! You're tough, lets try for a tiebreaker\\r\\n";
						return a+b+c+d;
					}
					else {
						String d=" Damn! You won on a double!\\r\\n";
						return a+b+c+d;
					}
				}
				if (diceC==diceD) {
					String d=" Damn! I win on a double! AH! I pity you fool!\\r\\n";
					return a+b+c+d;
				}
				else {String d=" Stalemate! You’re tough, let’s try for a tie-breaker.\r\n";
				return a+b+c+d;
					
				}
			}
			else if(pcSum>cpSum) {
				String d=" You win!! Did you cheat?? Gimme another try, c’mon.";
				return a+b+c+d;
			//	System.out.println("Did you cheat?? Gimme another try, c’mon Press any key and ENTER to throw\r\n" + 
				//		"your dice or press (Q or q) to quit” ");
			}
			else {
				String d=" I win!! Wanna try again?";
				return a+b+c+d;
				//System.out.println("Wanna try again? Press any key and ENTER to throw your dice or press (Q or\r\n" + 
					//	"q) to quit");
			}
			
			//System.out.println("Do you want to play again? Y or y and enter to play again");
			//Scanner input= new Scanner(System.in);
			//String secAns=input.nextLine();
			//if (!secAns.equalsIgnoreCase("q")) {
				//return true;
			//}
			//else {
				//System.out.println("Thanks for being a sport! Laters!");
				//return false;
			//}
		}
		//else {
			//exit game
			//System.out.println("See you later alligator");
			//return "what";
		//}
		return "but why";
		
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

}
