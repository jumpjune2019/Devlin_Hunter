import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LightSimulation {
	
	public static Scanner input= new Scanner(System.in);
	static boolean trafficLightGo=true;
	static ThreadControl thread1=new ThreadControl();
	static ThreadControl thread2=new ThreadControl();
	static ThreadControl thread3=new ThreadControl();
	static ThreadControl thread4=new ThreadControl();
	public static void main(String[] args) {
		/*
		 * Threads run and run and run. Eventually they stop. They die. It is sad. We cry. Everytime. 
		 */
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread4.cont();
		thread1.setLightValue(Enum.Lights.GREEN.getColor());
		thread1.setTimeValue(Enum.Lights.GREEN.getTime());
		
		thread2.setLightValue(Enum.Lights.YELLOW.getColor());
		thread3.setLightValue(Enum.Lights.RED.getColor());
		
		thread2.setTimeValue(Enum.Lights.YELLOW.getTime());
		thread3.setTimeValue(Enum.Lights.RED.getTime());
		
		//boolean trafficLightGo=true;
		String lightColor="Green";
		System.out.println("Traffic Light Simulator is a go!");
		
		
		while(trafficLightGo){
			switch (lightColor){
			case "Green":
				trafficControls(thread1,thread2);
				lightColor="Yellow";
				
			break;
			case "Yellow":
				trafficControls(thread2,thread3);
				lightColor="Red";
				break;
			case "Red":
				trafficControls(thread3,thread1);
				lightColor="Green";
			break;
			}		
		}
	}
	public static void trafficControls(Thread light,Thread nextLight) {
		int i=((ThreadControl)light).getTime()*1000;
		((ThreadControl) light).cont();
		try {
			nextLight.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((ThreadControl) light).paused();
	}
	public static  void exit() {
		trafficLightGo=false;
		thread1.killThread();
		thread2.killThread();
		thread3.killThread();
		thread4.killThread();
	}
}
