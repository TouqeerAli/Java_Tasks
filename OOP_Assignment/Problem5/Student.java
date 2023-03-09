class Student{
	static int id=1001;
	String name;
	int age;
	
	public Student(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args){
		Student s1=new Student("Amir",20);
		System.out.println("ID : "+s1.id);
		System.out.println("Name : "+s1.name);
		System.out.println("Age : "+s1.age);
		
		Student s2=new Student("Rafey",19);
		System.out.println("ID : "+(s2.id+1));
		System.out.println("Name : "+s2.name);
		System.out.println("Age : "+s2.age);
		
		Student s3=new Student("Touqeer",19);
		System.out.println("ID : "+(s3.id+2));
		System.out.println("Name : "+s3.name);
		System.out.println("Age : "+s3.age);
		
		Student s4=new Student("Haseeb",20);
		System.out.println("ID : "+(s4.id+3));
		System.out.println("Name : "+s4.name);
		System.out.println("Age : "+s4.age);
		
		Student s5=new Student("Inam",20);
		System.out.println("ID : "+(s5.id+4));
		System.out.println("Name : "+s5.name);
		System.out.println("Age : "+s5.age);
	}
}