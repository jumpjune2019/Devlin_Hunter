import java.util.Scanner;



public class ThreadControl {
	
	
	public static void main(String[] args)  {
		try {
			/*
			 * CREATING THREADS
			 */
			Threader thread1=new Threader();
			Threader thread2=new Threader();
			Threader thread3=new Threader();
			Threader thread4=new Threader();
			Threader thread5=new Threader();
			
			/*
			 * STARTING THREADS
			 */
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
			thread5.start();
			Scanner input=new Scanner(System.in);
			/*
			 * BOOLEANS USED FOR WHILE LOOPS
			 * ACTIVE CHECKS TO MAKE SURE ALL LOOPS ARE ACTIVE. OUTERMOST WHILE LOOP WILL END WHEN ACTIVE IS FALSE
			 * THRD# CHECKS TO SEE WHICH THREAD YOU NEED TO BE IN BASED ON INPUT OF USER. ONLY ENTER ONE LOOP WHILE
			 * THE THRD# IS ACTIVE
			 * PAUSE# VERIFIES IF YOU SHOULD BE TRYING TO PAUSE OR RESUME THE THREAD AFTER CALLING PAUSE OR RESUME
			 * KILLED# VERIFIES IF THE THREAD IS KILLED
			 * ISKILLED COUNTS EVERY LOOP THAT IS KILLED. WHEN ALL THE LOOPS ARE KILLED IT WILL SET ACTIVE TO FALSE
			 * AND END THE LAST WHILE LOOP
			 */
			boolean active=true;
			boolean thrd1=false;
			boolean thrd2=false;
			boolean thrd3=false;
			boolean thrd4=false;
			boolean thrd5=false;
			
			boolean pause1=false;
			boolean pause2=false;
			boolean pause3=false;
			boolean pause4=false;
			boolean pause5=false;
			
			boolean killed1=false;
			boolean killed2=false;
			boolean killed3=false;
			boolean killed4=false;
			boolean killed5=false;
			
			int isKilled=0;
			/*
			 * OUTERMOST LOOP THAT KEEP EVERYTHING LOOPING
			 */
			while(active) {
				System.out.println("Pick a thread");
				String text=input.nextLine();
				/*
				 * USER INPUT FOR PICKING A THREAD TO GO TO. EACH STATEMENT SETS ALL THREADS TO FALSE EXCEPT ONE 
				 * WHICH IS THE ONE THE USER WANTS TO USE
				 */
				if(text.equals("1")) {
					thrd1=true;
					thrd2=false;
					thrd3=false;
					thrd4=false;
					thrd5=false;
				}
				else if(text.equals("2")) {
					thrd2=true;
					thrd1=false;
					thrd3=false;
					thrd4=false;
					thrd5=false;
				}
				else if(text.equals("3")) {
					thrd3=true;
					thrd2=false;
					thrd1=false;
					thrd4=false;
					thrd5=false;
				}
				else if(text.equals("4")) {
					thrd4=true;
					thrd2=false;
					thrd3=false;
					thrd1=false;
					thrd5=false;
				}
				else if(text.equals("5")) {
					thrd5=true;
					thrd2=false;
					thrd3=false;
					thrd4=false;
					thrd1=false;
				}
				/*
				 * ALL WHILES AFTER THIS FIRST LOOP WORK THE SAME
				 * WHILE LOOP FOR THE THREAD
				 */
				while(thrd1) {
					/*
					 * CHECKS TO SEE IF THE THREAD HAS BEEN TERMINATED
					 */
					if(!killed1) {
						System.out.println("Controlling first thread");
						text=input.nextLine();
						/*
						 * ASKS FOR USER INPUT TO PAUSE THE THREAD, RAISE, NORMALIZE, OR LOWER THE PRIORITY
						 * OR KILL THE THREAD
						 */
						if (text.equalsIgnoreCase("1")) {
							/*
							 * CALLS THE PAUSE METHOD FROM THE THREAD CLASS
							 * SETS PAUSE# BOOLEAN TO TRUE SO IT WILL USE THE OTHER ELSE IF AFTER YOU PAUSE THE THREAD
							 */
							if(!pause1) {
								thread1.pause();
								pause1=true;
							}
							/*
							 * CALLS THE CONT METHOD TO CONTINUE THE THREAD
							 * SETS PAUSE# TO TRUE SO IT WILL USE THE OTHER IF STATEMENT SINCE THE THREAD IS NO LONGER PAUSED
							 */
							else if(pause1) {
								thread1.cont();
								pause1=false;
							}
							
						}
						/*
						 * SETS PRIORITY TO MAX
						 */
						else if(text.equalsIgnoreCase("T")) {
							thread1.setPriority(10);
						}
						/*
						 * SETS PRIORITY TO NORMAL
						 */
						else if(text.equalsIgnoreCase("N")) {
							thread1.setPriority(5);
						}
						/*
						 * SETS PRIORITY TO LOW
						 */
						else if(text.equalsIgnoreCase("L")) {
							thread1.setPriority(1);
						}
						/*
						 * CALLS KILL METHOD FROM THREAD CLASS
						 * SETS KILLED TO TRUE IN THIS THREAD
						 * GETS OUT OF THE LOOP FOR THE CURRENT THREAD
						 * ADDS TO ISKILLED COUNT SO THE OUTER ACTIVE LOOP WILL STOP WHEN ALL 5 ARE KILLED
						 */
						else if(text.equalsIgnoreCase("S")) {
							thread1.kill();
							killed1=true;
							thrd1=false;
							isKilled++;
							
						}
						/*
						 * USED TO SWITCH OUT OF THE LOOP YOU ARE IN
						 * SETS THE CURRENT THREAD WHILE LOOP TO FALSE
						 * SETS THE THREAD WHILE LOOP USER SELECTED TO TRUE
						 */
						else if(text.equals("2")) {
							System.out.println("switching loops");
							thrd2=true;
							thrd1=false;
							thrd3=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("3")) {
							System.out.println("switching loops");
							thrd3=true;
							thrd2=false;
							thrd1=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("4")) {
							System.out.println("switching loops");
							thrd4=true;
							thrd2=false;
							thrd3=false;
							thrd1=false;
							thrd5=false;
						}
						else if(text.equals("5")) {
							System.out.println("switching loops");
							thrd5=true;
							thrd2=false;
							thrd3=false;
							thrd4=false;
							thrd1=false;
						}
						
					}
					/*
					 * IF THE THREAD HAS BEEN KILLED IT WILL INFORM THE USER AND TAKE YOU OUT OF THE DEAD THREADS LOOP
					 */
					else {
						System.out.println("Thread 1 has been killed");
						thrd1=false;
					}
				}
				/*
				 * LOOK AT THE FIRST THREAD LOOP FOR DETAILS ON THIS THREAD LOOP. IT IS THE SAME
				 */
				while(thrd2) {
					if(!killed2) {
						System.out.println("Controlling 2nd thread");
						text=input.nextLine();
						if (text.equalsIgnoreCase("2")) {
							System.out.println("in 2nd thread loop ");
							if(pause2==false) {
								thread2.pause();
								pause2=true;
							}
							else if(pause1==true) {
								thread2.cont();
								pause2=false;
							}
						}
						else if(text.equalsIgnoreCase("T")) {
							thread2.setPriority(10);
						}
						else if(text.equalsIgnoreCase("N")) {
							thread2.setPriority(5);
						}
						else if(text.equalsIgnoreCase("L")) {
							thread2.setPriority(1);
						}
						else if(text.equalsIgnoreCase("S")) {
							thread2.kill();
							killed2=true;
							thrd2=false;
							isKilled++;
						}
						else if(text.equals("1")) {
							System.out.println("switching loops");
							thrd1=true;
							thrd2=false;
							thrd3=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("3")) {
							System.out.println("switching loops");
							thrd3=true;
							thrd2=false;
							thrd1=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("4")) {
							System.out.println("switching loops");
							thrd4=true;
							thrd2=false;
							thrd3=false;
							thrd1=false;
							thrd5=false;
						}
						else if(text.equals("5")) {
							System.out.println("switching loops");
							thrd5=true;
							thrd2=false;
							thrd3=false;
							thrd4=false;
							thrd1=false;
						}
					}
					else {
						System.out.println("Thread 2 has been killed");
						thrd2=false;
					}
				}
				/*
				 * LOOK AT THE FIRST THREAD LOOP FOR DETAILS ON THIS THREAD LOOP. IT IS THE SAME
				 */
				while(thrd3) {
					if(!killed3) {
						System.out.println("Controlling 3rd thread");
						text=input.nextLine();
						if (text.equalsIgnoreCase("3")) {
							System.out.println("in 3rd thread loop ");
							if(pause3==false) {
								thread3.pause();
								pause3=true;
							}
							else if(pause3==true) {
								thread3.cont();
								pause3=false;
							}
						}
						else if(text.equalsIgnoreCase("T")) {
							thread3.setPriority(10);
						}
						else if(text.equalsIgnoreCase("N")) {
							thread3.setPriority(5);
						}
						else if(text.equalsIgnoreCase("L")) {
							thread3.setPriority(1);
						}
						else if(text.equalsIgnoreCase("S")) {
							thread3.kill();
							killed3=true;
							thrd3=false;
							isKilled++;
						}
						else if(text.equals("2")) {
							System.out.println("switching loops");
							thrd2=true;
							thrd1=false;
							thrd3=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("1")) {
							System.out.println("switching loops");
							thrd1=true;
							thrd2=false;
							thrd3=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("4")) {
							System.out.println("switching loops");
							thrd4=true;
							thrd2=false;
							thrd3=false;
							thrd1=false;
							thrd5=false;
						}
						else if(text.equals("5")) {
							System.out.println("switching loops");
							thrd5=true;
							thrd2=false;
							thrd3=false;
							thrd4=false;
							thrd1=false;
						}
					}
					else {
						System.out.println("Thread 3 has been killed");
						thrd3=false;
					}
				}	
				/*
				 * LOOK AT THE FIRST THREAD LOOP FOR DETAILS ON THIS THREAD LOOP. IT IS THE SAME
				 */
				while(thrd4) {
					if(!killed4) {
						System.out.println("Controlling 4th thread");
						text=input.nextLine();
						if (text.equalsIgnoreCase("4")) {
							System.out.println("in 4th thread loop ");
							if(pause4==false) {
								thread4.pause();
								pause4=true;
							}
							else if(pause4==true) {
								thread4.cont();
								pause4=false;
							}
						}
						else if(text.equalsIgnoreCase("T")) {
							thread4.setPriority(10);
						}
						else if(text.equalsIgnoreCase("N")) {
							thread4.setPriority(5);
						}
						else if(text.equalsIgnoreCase("L")) {
							thread4.setPriority(1);
						}
						else if(text.equalsIgnoreCase("S")) {
							thread4.kill();
							killed4=true;
							thrd4=false;
							isKilled++;
						}
						else if(text.equals("2")) {
							System.out.println("switching loops");
							thrd2=true;
							thrd1=false;
							thrd3=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("3")) {
							System.out.println("switching loops");
							thrd3=true;
							thrd2=false;
							thrd1=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("1")) {
							System.out.println("switching loops");
							thrd1=true;
							thrd2=false;
							thrd3=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("5")) {
							System.out.println("switching loops");
							thrd5=true;
							thrd2=false;
							thrd3=false;
							thrd4=false;
							thrd1=false;
						}
					}
					else {
						System.out.println("Thread 4 has been killed");
						thrd4=false;
					}
				}
				/*
				 * LOOK AT THE FIRST THREAD LOOP FOR DETAILS ON THIS THREAD LOOP. IT IS THE SAME
				 */
				while(thrd5) {
					if(!killed5) {
						System.out.println("Controlling 5th thread");
						text=input.nextLine();
						if (text.equalsIgnoreCase("5")) {
							System.out.println("in 5th thread loop ");
							if(pause5==false) {
								thread5.pause();
								pause5=true;
							}
							else if(pause5==true) {
								thread5.cont();
								pause5=false;
							}
						}
						else if(text.equalsIgnoreCase("T")) {
							thread5.setPriority(10);
						}
						else if(text.equalsIgnoreCase("N")) {
							thread5.setPriority(5);
						}
						else if(text.equalsIgnoreCase("L")) {
							thread5.setPriority(1);
						}
						else if(text.equalsIgnoreCase("S")) {
							thread5.kill();
							killed5=true;
							thrd5=false;
							isKilled++;
						}
						else if(text.equals("2")) {
							System.out.println("switching loops");
							thrd2=true;
							thrd1=false;
							thrd3=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("3")) {
							System.out.println("switching loops");
							thrd3=true;
							thrd2=false;
							thrd1=false;
							thrd4=false;
							thrd5=false;
						}
						else if(text.equals("4")) {
							System.out.println("switching loops");
							thrd4=true;
							thrd2=false;
							thrd3=false;
							thrd1=false;
							thrd5=false;
						}
						else if(text.equals("1")) {
							System.out.println("switching loops");
							thrd1=true;
							thrd2=false;
							thrd3=false;
							thrd4=false;
							thrd5=false;
						}
					}
					else {
						System.out.println("Thread 5 has been killed");
						thrd5=false;
					}
	
				}
				/*
				 * IF STATEMENT THAT IF THE ISKILLED IS 5 (ALL THE THREADS HAVE BEEN KILLED) THE OUTER WHILE LOOP
				 * WILL BE SET TO FALSE
				 */
				if(isKilled==5) {
					active=false;
				}
			}
		}
		catch(Exception e) {
			System.out.println("There was an error");
		}
	}
}