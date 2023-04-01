import java.util.Scanner;
class FindingPower{
	static int p=2;
	public double power(double n, int p){
		
		double temp=1.0;
		for(int i=1; i<=p; i++){
			temp= temp*n;
		}
		return temp;
	}
	public int power(int n, int p){
	
		int temp=1;
		for(int i=1; i<=p; i++){
			temp= temp*n;
		}
		return temp;
	}
	public double power(double n){
		int p=2;
		double temp=1.0;
		for(int i=1; i<=p; i++){
			temp= temp*n;
		}
		return temp;
		
	}
	public static void main(String []args){
	FindingPower fp = new FindingPower();
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter type of Number:");
	System.out.println("1. int");
	System.out.println("2. double");
	int ch = sc.nextInt();
	int num1;
	double num2;
	int p;
	if(ch==1){
		System.out.println("Enter number:");
	 num1 = sc.nextInt();
	 System.out.println("Enter power:");
	 p = sc.nextInt();
	 if(p==0){
		System.out.println(num1+"^2"+" = "+fp.power(num1));
	 }else{
	System.out.println(num1+"^"+p+" = "+fp.power(num1,p));
	 }
	}else if(ch==2){
		System.out.println("Enter number:");
		 num2 = sc.nextDouble();
		 System.out.println("Enter power:");
	 p = sc.nextInt();
	if(p==0){
		System.out.println(num2+"^2"+" = "+fp.power(num2));
	 }else{
	System.out.println(num2+"^"+p+" = "+fp.power(num2,p));
	 }
	}
	

	}
}