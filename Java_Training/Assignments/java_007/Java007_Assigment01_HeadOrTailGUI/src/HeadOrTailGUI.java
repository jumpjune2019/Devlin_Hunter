import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class HeadOrTailGUI {
	public static JFrame setFrameStuff(JFrame frm, int width, int height, int onExit) {
				
		frm.setSize(width, height);
		frm.setDefaultCloseOperation(onExit);
		JPanel panel1 = new JPanel();
		//JLabel lab = new JLabel(label);
		panel1.setLayout(new FlowLayout());
		ButtonDemo bd = new ButtonDemo();
		bd.setButtons(panel1, "ClipToFlip", "Reset", "Waiting ", value(number()));
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
				
				String flip=value(number());
				demo = new SwingDemo("Demo 1");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, 375, 100, JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
				
			}
		});
	}
	public static int number() {
		Lambda test=()->(int) Math.ceil((Math.random()*2));
		return test.getValue();
	}
	
	static String value(int num) {
		LammyDammy publicMain=(numb)->{
			if(numb==1) {
				return "The coin flip is Head";
			}
			else if(numb==2) {
				return "The coin flip is Tails";
			}
			else {
				return "not working";
			}
		};
		return publicMain.getValue(number());
	}
}
