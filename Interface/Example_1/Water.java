class Water implements Beverages{
	public void drink(){
		System.out.println("someone is drinking water");
	}
	public void refill(){
		System.out.println("refiill the botel of water");
	}
	
	public static void main(String[] args){
		Water w = new Water();
		w.drink();
		w.refill();
	}
}