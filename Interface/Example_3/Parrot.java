class Parrot implements Bird{
	public void fly(){
		System.out.println("Parrot is flying");
	}
	public void goDown(){
		System.out.println("Parrot is going down");
	}
	public void goUp(){
		System.out.println("Parrot is going Up");
	}
	
	public static void main(String [] args){
		Parrot p = new Parrot();
		p.fly();
		p.goDown();
		p.goUp();
	}
}