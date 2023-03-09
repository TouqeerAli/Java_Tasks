interface Shape{
	void printLine(String s);
}
public class Main{
	void printLine(String s){
		int i=1;
		while(i<=10){
		System.out.print(s);
		i++;
		}
	}
	public static void main(String[] args){
		Main m=new Main();
		System.out.println("Hi, everybody");
		m.printLine("+");
	}
}