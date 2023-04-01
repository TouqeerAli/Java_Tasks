import java.util.Scanner;
class Time{
	private int timeInSec;
	
	public void setTimeInSec(int timeInSec){
		this.timeInSec=timeInSec;
	}
	public int getTimeInSec(){
		return this.timeInSec;
	}
	
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	Time t = new Time();
	System.out.print("Enter time in seconds: ");
	int time = sc.nextInt();
	t.setTimeInSec(time);
	int calTime =t.getTimeInSec();
	int hr = calTime/3600;
	String hrStr= String.format("%02d",hr);
	calTime = calTime-hr*3600;
	int min = calTime/60;
	String minStr= String.format("%02d",min);
	calTime = calTime-min*60;
	int sec = calTime;
	String secStr= String.format("%02d",sec);
	System.out.print("Time in HH:MM:SS formate: "+ hrStr+":"+minStr+":"+secStr);
	}
}