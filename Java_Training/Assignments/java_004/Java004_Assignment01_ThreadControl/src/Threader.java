
public class Threader extends Thread{
	public Object lock=this;
	public Object unlock=this;
	public boolean pause;
	boolean go=true;
	public void run(){
		
		while(go) {
			
			try {
				this.sleep(2000);
					/*
					 * USED FOR PAUSING LOOP. IF PAUSED THE LOOP WITH WAIT WHEN UNPAUSED IT WILL PRINT OUT
					 * ITS THREAD ID AND PRIORITY
					 */
					
					while (pause) {
						System.out.println(this.getId()+" Thread is paused");
						synchronized(lock) {
							wait();
						}
					}
					if (!pause) {
						
						System.out.println(this.getId()+" Thread: priority "+this.getPriority());
					}					
				
			}
			catch(Exception e) {
				
			}
		}
	}
	/*
	 * CALLED IN MAIN METHOD TO PAUSE THE THREAD
	 */
	public void pause(){
		this.pause=true;
	}
	/*
	 * CALLED IN MAIN METHOD TO CONTINUE THE THREAD
	 */
	public void cont() {
		System.out.println("Thread unpaused");
		synchronized(unlock){
		notify();
		this.pause=false;
		}
		
		
	}
	public void kill() {
		/*
		 * lock thread forever
		 */
		go=false;
	}
}