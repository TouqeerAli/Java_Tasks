class Company{
	private String name;
	private String location;
	private Employee employee;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setLocation(String location){
		this.location=location;
	}
	public String getLocation(){
		return this.location;
	}
	public void setEmployee(Employee employee){
		this.employee=employee;
	}
	public Employee getEmployee(){
		return this.employee;
	}
}