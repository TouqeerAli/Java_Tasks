public class TraficLights implements Runnable{

	@Override
	public void run() {
		
			System.out.println("Red - STOP");
			for(int i=1; i<=3; i++) {
				System.out.print (i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			}
			System.out.println("\nYellow - WAIT (Red lght is going to be start)");
			for(int i=1; i<=3; i++) {
				System.out.print(i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
			System.out.println("\nGreen - GO");
			
		
		
	}
	
	public static void main(String[] args) {
		TraficLights tl = new TraficLights();
		Thread th = new Thread(tl);
		th.start();
	}
}
