// A simple Swing Program
import java.awt.*;
import javax.swing.*;
public class Main {
	
	public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height) {
		Lmaoda center=(a,b,c)->{
			// set the size of the frame to half in width and height
			a.setSize(b/2, c/2);
			// here's the part where the JFrame gets actually centered
			a.setLocationRelativeTo(null);
		};
		center.getValue(frm, width, height);
	}

	public static JFrame setFrameStuff(JFrame frm, int onExit, int width, int height) {
		// this will center and size the JFrame on screen
		// it will have a height and width of half the screen
		Lmuda frameStuff=(fra,ex,wi,hi)->{
			centerAndSizeJFrameOnScreen(fra, wi, hi);
			fra.setDefaultCloseOperation(ex);
		
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
		
		
			panel1.setLayout(new FlowLayout());
			panel2.setLayout(new FlowLayout());
		
		
			ButtonDemo bd = new ButtonDemo();
			bd.setButtons(panel1, "First", "Second", "You Pressed First", "You Pressed Second");
			ButtonDemo bd2 = new ButtonDemo();
			bd2.setButtons(panel2, "Up", "Down", "Going Up!", "Going Down!");
		
		
		
			fra.add(panel1);
			fra.add(panel2);
			return fra;
		};
		return frameStuff.getValue(frm, onExit, width, height);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingDemo demo;
			JFrame frm;
			
			public void run() {
				demo = new SwingDemo("Playing with JButton using a FlowLayout");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 700, 700);
				frm.setVisible(true);
			}
		});
	}
}