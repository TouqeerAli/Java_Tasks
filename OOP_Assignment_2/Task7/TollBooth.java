import java.util.Scanner;
class TollBooth{
	private int payingCars;
	private int notPayingCars;
	private double money;
	
	public TollBooth(){
		this.payingCars=0;
		this.notPayingCars=0;
		this.money=0;
	}
	
	public void  payingCar(){
		payingCars++;
		money+=0.50;
	}
	public void  noPayCar(){
		notPayingCars++;
		
	}
	public void display(){
		System.out.println("Total No. of cars(paying and not paying): "+(this.payingCars+this.notPayingCars));
		System.out.println("Total cash: "+this.money);
	}
	public static void main(String []args){
	TollBooth tb = new TollBooth();
	Scanner sc = new Scanner(System.in);
	boolean temp=true;
	System.out.println("Press A to count paying car and B to count not paying car and ESC to display total:");
	while(temp){
	
	char key = sc.next().charAt(0);
	
	if(key=='a'){
		tb.payingCar();
	}else if(key=='b'){
		tb.noPayCar();
	}else if((int)key==27){
		tb.display();
		temp=false;
	}
	else{
		System.out.println("Invalid input!!!");
	}
	}
	
	}
}