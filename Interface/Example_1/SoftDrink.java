class SoftDrink implements Beverages{
	public void drink(){
		System.out.println("Someone drank Softdrink");
	}
	public void refill(){
		System.out.println("refiling botel of Soft Drink");
	}
	
	public static void main(String[] args){
		SoftDrink w = new SoftDrink();
		w.drink();
		w.refill();
	}
}