import java.util.Scanner;
class Exam extends Student{
	int sub1;
	int sub2;
	int sub3;
	
	public void getMark(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for sub1,sub2 and sub3 : ");
		this.sub1=sc.nextInt();
		this.sub2=sc.nextInt();
		this.sub3=sc.nextInt();
	
	}
	public void showMark(){
		System.out.println("Sub1 : "+sub1);
		System.out.println("Sub2 : "+sub2);
		System.out.println("Sub3 : "+sub3);
	}
	
	public static void main(String[] args){
		Exam e[] = new Exam[5];
			System.out.println("Enter the data of "+e.length+" students");

		for(int i=0; i<e.length; i++){
			e[i] = new Exam();
			e[i].getStudent();
			e[i].getMark();
			
		}
		for(int i=0; i<e.length; i++){

		e[i].displayStudent();
			e[i].showMark();
		}
	}
}