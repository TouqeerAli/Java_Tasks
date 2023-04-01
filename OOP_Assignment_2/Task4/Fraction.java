import java.util.Scanner;
class Fraction{
	
	public static void main(String []args){
		boolean check=true;
	while(check){
	Scanner sc=new Scanner(System.in);
	//first fraction
	String frac1 = sc.next();
	String[] str1 = frac1.split("/",2);
	int a =Integer.parseInt(str1[0]);
	int b =Integer.parseInt(str1[1]);
	
	//operator
	char op = sc.next().charAt(0);
	
	//second fraction
	String frac2 = sc.next();
	String[] str2 = frac2.split("/",2);
	int c=Integer.parseInt(str2[0]);
	int d =Integer.parseInt(str2[1]);
	
	switch(op){
		case '+':
		{
			System.out.println("Addition: "+ ((a*d)+(b*c))+"/"+(b*d));
			break;
		}
		case '-':
		{
			System.out.println("Subtraction: "+((a*d)-(b*c))+"/"+(b*d));	
			break;
		}
		case '*':
		{
			
			System.out.println("Multiplication: "+(a*c)+"/"+(b*d));
			break;
		}
		case '/':
		{
			System.out.println("Division: "+(a*d)+"/"+(b*c));
			break;
		}
		default:
		{
			System.out.println("Invalid Operator");
		}
	}
	System.out.print("Do another (y/n) ? ");
	char yOrN = sc.next().charAt(0);
	if(yOrN=='n' || yOrN=='N'){
		check=false;
	}
	}
	}
}