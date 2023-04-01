import java.util.Scanner;
class Calculator{
	public static void main(String []args){
	boolean check=true;
	while(check){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number, operator and second number: ");
	int num1,num2;
	num1=sc.nextInt();
	char op=sc.next().charAt(0);
	num2=sc.nextInt();

	switch(op){
		case '+':
		{
			System.out.println("Answer: "+(float)(num1+num2));
			break;
		}
		case '-':
		{
			System.out.println("Answer: "+(float)(num1-num2));
			break;
		}
		case '*':
		{
			System.out.println("Answer: "+(float)(num1*num2));
			break;
		}
		case '/':
		{
			System.out.println("Answer: "+(float)(num1/num2));
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