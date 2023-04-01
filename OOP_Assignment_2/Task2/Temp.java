import java.util.Scanner;
class Temp{
	public void fahrToCel(int temp){
		System.out.println("In Celcius : "+(float)((temp-32)*5)/9);
	}
	public void celToFahr(int temp){
		System.out.println("In Fahrenheit : "+(float)(temp*1.8+32));
	}
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	Temp t = new Temp();
	System.out.println("Type 1 to convert Fahrenhiet to Celsius,\n     2 to convert Celsius to Fahrenheit:");
	int num = sc.nextInt();
	if(num==1){
		System.out.print("Enter temperature in Fahrenheit: ");
		int temperature=sc.nextInt();
		t.fahrToCel(temperature);
	}else if(num==2){
		System.out.print("Enter temperature in Celcius: ");
		int temperature=sc.nextInt();
		t.celToFahr(temperature);
	}else
		System.out.println("Invalid!!!");
	}
}