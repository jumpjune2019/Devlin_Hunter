// A simple Swing Program
import java.awt.Dimension;
import java.awt.Toolkit;

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
	// this is how we can create a pseudo-dynamic array
	// at run time based on enums
	public static void setLabelsToFrame(JFrame fr) {
		Lambda label=(frm)->{
		int labelsEnumLength = LabelsEnum.values().length;
		int count = 0;
		JLabel myLabels[] = new JLabel[labelsEnumLength];
		MyLabel tempLabel;
		for(LabelsEnum le : LabelsEnum.values()) {
			tempLabel = new MyLabel();
			myLabels[count] = tempLabel.setLabel(le.getLabel(), le.getPosition(), frm);
			count++;
		}
		};
		label.getValue(fr);
	}
	
	public static JFrame setFrameStuff(JFrame fr, int onExi, int widt, int heigh) {
		// this will center and size the JFrame on screen
		// it will have a height and width of half the screen
		Lamdba frame=(frm,onExit,width,height)->{
		centerAndSizeJFrameOnScreen(frm, 400, 400);
		frm.setDefaultCloseOperation(onExit);
		setLabelsToFrame(frm);
		return frm;
		};
		return frame.getValue(fr, onExi, widt, heigh);
	}
	
	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {
			SwingDemo demo;
			JFrame frm;
			
			public void run() {
				demo = new SwingDemo("Centered JFrame 400 by 200 with 5 labels");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 400, 200);
				frm.setVisible(true);
			}
		});
	}
}