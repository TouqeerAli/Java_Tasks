class Student2 extends Marks{
	int sub1;
	int sub2;
	int sub3;
	Student2(int sub1,int sub2,int sub3){
	this.sub1=sub1;
	this.sub2=sub2;
	this.sub3=sub3;
	}
	void getPercentage(){
		System.out.println("Percentage of student2 is "+((sub1+sub2+sub3)*100)/300);
	}
	public static void main (String []args){
		Student2 st2= new Student2(30,20,40);
		st2.getPercentage();
	}
}