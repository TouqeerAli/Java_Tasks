class Shape{
	public double area(double side){
		return side*side;
	}
	public double area(double length, double width){
		return length*width;
	}
	public double area(int radius){
		return 3.14*radius*radius;
	}

	public static void main(String[] args){
		Shape s = new Shape();
		System.out.println("Area of Square : "+s.area(2.4));
		System.out.println("Area of Rectangle : "+s.area(2.1,2));
		System.out.println("Area of Circle : "+s.area(3.5));

	}
}