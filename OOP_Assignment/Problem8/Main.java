abstract class Bank{
	abstract double simpleInterest(double p, double t);
}
public class Main extends Bank {

	double simpleInterest(double p, double t){
		double r=13;
		return (p*r*t)/100;
	}
	public static void main(String[] args){
		Main bank1=new Main();		
		System.out.println("Simple Interest for bank1 : "+bank1.simpleInterest(100000, 3));
		Main bank2=new Main();	
		System.out.println("Simple Interest for bank2 : "+bank1.simpleInterest(200000, 4));
	}
}