import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;

public class ButtonDemo  implements ActionListener {
	JLabel jlab;
	String first;
	String second;
	String firstMsg;
	String secondMsg;
	
	public void setButtons(JPanel frm, String f, String s, String fMsg, String sMsg) {
		first = f;
		second = s;
		firstMsg = fMsg;
		secondMsg = sMsg;
		
		JButton jbtnUp = new JButton(first);
		JButton jbtnDown = new JButton(second);
		// Add action listeners.
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		// Add the buttons to the content pane.
		frm.add(jbtnUp);
		frm.add(jbtnDown);
		// Create a label.
		jlab = new JLabel("Waiting...");
		// Add the label to the frame.
		frm.add(jlab);
	}
	
	// Handle button events.

	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals(first)) {
			String s=HeadOrTailGUI.value(HeadOrTailGUI.number());
			jlab.setText(s);
		} else {
			jlab.setText("Waiting...");
		}
	}
}
