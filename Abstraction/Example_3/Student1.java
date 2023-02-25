class Student1 extends Marks{
	int sub1;
	int sub2;
	int sub3;
	Student1(int sub1,int sub2,int sub3){
	this.sub1=sub1;
	this.sub2=sub2;
	this.sub3=sub3;
	}
	void getPercentage(){
		System.out.println("Percentage of student1 is "+((sub1+sub2+sub3)*100)/300);
	}
	public static void main (String []args){
		Student1 st1= new Student1(10,30,40);
		st1.getPercentage();
	}
}