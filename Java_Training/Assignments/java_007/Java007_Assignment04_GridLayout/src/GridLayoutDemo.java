
	import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.WindowAdapter;
	import java.awt.event.WindowEvent;

	import javax.swing.*;

	public class GridLayoutDemo  implements ActionListener {
	   private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;

	   public GridLayoutDemo(){
	      prepareGUI();
	   }
	   
	   private void prepareGUI(){
	      mainFrame = new JFrame("Grid Layout Example");
	      mainFrame.setSize(800,400);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      headerLabel = new JLabel("",JLabel.CENTER );
	      statusLabel = new JLabel("",JLabel.CENTER);        
	      statusLabel.setSize(350,100);
	      
	      // old school way to close a window
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	             // this is the way to force a java application to gracefully exit
	        	 // when not going to end via the main method entry point
	        	 System.exit(0);
	         }        
	      });    
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	   
	   private void showGridLayoutDemo() throws NullPointerException {
	      headerLabel.setText("Basic Matrix Demo");      
	      statusLabel.setText("No Seat Selected");
	      JPanel panel = new JPanel();
	      panel.setBackground(Color.BLUE);
	      panel.setSize(900,900);
	      int n=Rand();
	      int y=Rand();
	      int ny=n*y;
	      GridLayout layout = new GridLayout(n,y);
	      layout.setHgap(10);
	      layout.setVgap(10);
	      panel.setLayout(layout);
	      int length = ny;
	      JButton[] buttons = new JButton[length];
	      int j;
	      String prefixLabel = "Seat ";
	      for (j = 1; j < n+1; j++) {
	    	  int x=0;
	    	  for (int i=0;i<y;i++) {
	    		  switch (j){
	    		  case 1:
	    			  	prefixLabel="A";
	    		  		buttons[x] = new JButton(prefixLabel.concat(Integer.toString(x + 1)));
	    		  		buttons[x].addActionListener(this);
	    		  		
	    		  		panel.add(buttons[x]);
	    		  		x++;
	    		  		System.out.println(x);
	    		  		break;
	    		  case 2:
	    			  prefixLabel="B";
	    		  		buttons[x] = new JButton(prefixLabel.concat(Integer.toString(x + 1)));
	    		  		buttons[x].addActionListener(this);
	    		  		panel.add(buttons[x]);
	    		  		x++;
	    		  		System.out.println(x);
	    		  		break;
	    		  case 3:
	    			  prefixLabel="C";
	    		  		buttons[x] = new JButton(prefixLabel.concat(Integer.toString(x + 1)));
	    		  		buttons[x].addActionListener(this);
	    		  		panel.add(buttons[x]);
	    		  		x++;
	    		  		System.out.println(x);
	    		  		break;
	    		  case 4:
	    			  prefixLabel="D";
	    		  		buttons[x] = new JButton(prefixLabel.concat(Integer.toString(x + 1)));
	    		  		buttons[x].addActionListener(this);
	    		  		panel.add(buttons[x]);
	    		  		x++;
	    		  		System.out.println(x);
	    		  		break;
	    		  case 5:
	    			  prefixLabel="E";
	    		  		buttons[x] = new JButton(prefixLabel.concat(Integer.toString(x + 1)));
	    		  		buttons[x].addActionListener(this);
	    		  		panel.add(buttons[x]);
	    		  		x++;
	    		  		System.out.println(x);
	    		  		break;
	    		  }
	    		  
	    	  }
	      }
	      
	      controlPanel.add(panel);
	      mainFrame.setVisible(true);  
	   }
	 
	   public void actionPerformed(ActionEvent ae) {
		   statusLabel.setText(ae.getActionCommand());
	   }
	   
	   public static void main(String[] args){
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					GridLayoutDemo gridLayoutDemo = new GridLayoutDemo();  
				    gridLayoutDemo.showGridLayoutDemo();
				}
			});      
	   }
	
	public static int Rand() {
		Lambda test=()->(int) Math.ceil((Math.random()*5));
		int s=test.getValue();
		while(s<2) {
				//System.out.println(s);
				test=()->(int) Math.ceil((Math.random()*5));
				s=test.getValue();
		}
		return s;
	}

}
