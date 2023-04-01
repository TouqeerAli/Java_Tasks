import java.util.Scanner;
class Distance{
	private int distance;
	private String unit;
	
	public void setDistance(int distance){
		this.distance=distance;
	}
	public int getDistance(){
		return this.distance;
	}
	public void setUnit(String unit){
		this.unit=unit;
	}
	public String getUnit(){
		return this.unit;
	}
	
	public double convertToInches(int distance, String unit){
		if(unit.equals("inches")){
			return distance;
		}else if(unit.equals("millimeters")){
			return (distance*0.039);
		}else if(unit.equals("kilometers")){
			return (distance*39370.1 );
		}
		return 0;
	}
	public double convertToMillimeters(int distance, String unit){
		if(unit.equals("millimeters")){
			return distance;
		}else if(unit.equals("inches")){
			return (distance*25.4);
		}else if(unit.equals("kilometers")){
			return distance*1000000;
		}
		return 0;
	}
	public double convertToKilometers(int distance, String unit){
		if(unit.equals("kilometers")){
			return distance;
		}else if(unit.equals("inches")){
			return (distance*2.54E-5);
		}else if(unit.equals("millimeters")){
			return (distance/1000000);
		}
		return 0;
	}
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	Distance d = new Distance();
	System.out.println("Enter the distance: ");
	int dis = sc.nextInt();
	System.out.println("Enter the unit (inches, millimeters, kilometers): ");
	String u = sc.next();
	System.out.println("In Which unit you want to convert");
	System.out.println("1. inches");
	System.out.println("2. millimeters");
	System.out.println("3. kilometers");
	int ch = sc.nextInt();
	double conversion;
	switch(ch){
		case 1:
		{
			conversion=d.convertToInches(dis,u);
			System.out.println(dis+" "+u+" = "+conversion);
			break;
		}
		case 2:
		{
			conversion=d.convertToMillimeters(dis,u);
			System.out.println(dis+" "+u+" = "+conversion);
			break;
		}
		case 3:
		{
			conversion=d.convertToKilometers(dis,u);
			System.out.println(dis+" "+u+" = "+conversion);
			break;
		}
		default:
		{
			System.out.println("Invalid Choice!!!");
		}
	}
	}
}