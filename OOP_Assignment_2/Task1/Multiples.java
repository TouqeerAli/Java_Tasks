import java.util.Scanner;
class Multiples{
	
	public void generateTable(int num){
		int count=0;
		for(int i=1; i<=200; i++){
			System.out.printf("%-10s",i*num);
			//System.out.print(i*num+"\t");
			count++;
			if(count==10){
				System.out.println();
				count=0;
			}
		}
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Multiples mp = new Multiples();
	System.out.println("Enter the Number: ");
	int num=sc.nextInt();
	mp.generateTable(num);
	}
}