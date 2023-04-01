class Rodent{
	public void chew(){
		System.out.println("Rodent is chewing");
	}
	public void run(){
		System.out.println("Rodent is running");
	}
}
class Mouse extends Rodent{
	public void chew(){
		System.out.println("Mouse is chewing");
	}
	public void run(){
		System.out.println("Mouse is running");
	}
}
class  Gerbil extends Rodent{
	public void chew(){
		System.out.println("Gerbil is chewing");
	}
	public void run(){
		System.out.println("Gerbil is running");
	}
}
class Hamster extends Rodent{
	public void chew(){
		System.out.println("Hamster is chewing");
	}
	public void run(){
		System.out.println("Hamster is running");
	}
}
class DemoRodent{
	public static void main(String []args){
		Rodent[] rd = new Rodent[4];
		rd[0]= new Rodent();
		rd[1]= new Mouse();
		rd[2]= new Gerbil();
		rd[3]= new Hamster();
		
		rd[0].chew();
		rd[0].run();
		
		rd[1].chew();
		rd[1].run();
		
		rd[2].chew();
		rd[2].run();
		
		rd[3].chew();
		rd[3].run();
		
	}

}