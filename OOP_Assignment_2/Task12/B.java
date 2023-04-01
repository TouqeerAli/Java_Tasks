class A{
	public void first(){
		System.out.println("This is first method of class A");
		second();
	}
	public void second(){
		System.out.println("This is second method of class A");
	}
}
class B extends A{
	public void second(){
		System.out.println("This is second method of class B");
	}
	public static void main(String []args){
		B b = new B();
		b.first();
	}
}