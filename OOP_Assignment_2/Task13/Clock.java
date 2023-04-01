class Clock{
	private int hour;
	private int minutes;
	private int seconds;
	private boolean isAM;
	
	public Clock(){
		this.hour=12;
		this.minutes=0;
		this.seconds=0;
		this.isAM=true;
	}
	public Clock(int hour, boolean isAM){
		this.hour=hour;
		this.isAM=isAM;
		this.minutes=0;
		this.seconds=0;
	}
	public void setTime(int hour,int minutes, int seconds,boolean isAM){
		this.hour=hour;
		this.minutes=minutes;
		this.seconds=seconds;
		this.isAM=isAM;
	}

	public int getHour(){
		return this.hour;
	}
	public int getMinutes(){
		return this.minutes;
	}
	public int getSeconds(){
		return this.seconds;
	}
	public boolean getIsAM(){
		return this.isAM;
	}
	
	public static void main(String []args){
		Clock clk = new Clock();
		if(clk.getIsAM()==true){
		System.out.println("Time: "+clk.getHour()+":"+clk.getMinutes()+":"+clk.getSeconds()+" AM");
		}else{
			System.out.println("Time: "+clk.getHour()+":"+clk.getMinutes()+":"+clk.getSeconds()+" PM");
		}
		Clock clk2 = new Clock(10,false);
		if(clk2.getIsAM()==true){
		System.out.println("Time: "+clk2.getHour()+":"+clk2.getMinutes()+":"+clk2.getSeconds()+" AM");
		}else{
			System.out.println("Time: "+clk2.getHour()+":"+clk2.getMinutes()+":"+clk2.getSeconds()+" PM");
		}
	}

}