import java.util.Scanner;

public class ThreadControl extends Thread {
	boolean pause=true;
	public String lightValue="none";
	public int time=0;
	static boolean threading=true;
	public Object lock=this;
	public Object unlock=this;
	
	public void run() {
		Scanner input=new Scanner(System.in);
		
		while(threading==true) {
			
			while(pause) {
				try {
					synchronized(lock) {
						wait();
					}
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			while(!pause) {
				switch(lightValue) {
				case "Green":
					System.out.println("Light is Green- Go!");
					pause=true;
					
					try {
						Thread.sleep(time*1000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					break;
				case "Yellow":
					System.out.println("Light is Yellow Beware!");
					pause=true;
					try {
						Thread.sleep(time*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
					
				case "Red":
					System.out.println("Light is Read- Stop!");
					pause=true;
					try {
						Thread.sleep(time*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				case "none":
					String s=input.nextLine();
					if(!s.equals(null)) {
						System.out.println("Traffic Light Simulator is done!");
						LightSimulation.exit();
						input.close();
					}
					else {
						System.out.println("Going");
					}
					break;
				default:
					continue;	
				}
			}
		}
	}
	public void paused() {
		this.pause=true;
		
	}
	public void cont() {		
		synchronized(unlock){
			this.pause=false;
			notify();		
		}
	}
	public void setLightValue(String light) {
		this.lightValue=light;
	}
	public void setTimeValue(int num) {
		this.time=num;
	}
	public int getTime() {
		return time;
	}
	public void killThread() {
		synchronized(unlock){
			System.exit(0);
					
		}
	}
}