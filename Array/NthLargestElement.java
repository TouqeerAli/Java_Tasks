import java.util.Scanner;
class NthLargestElement{
	public static void main(String[] args){
	int arr[] = {2,4,1,7,3,5};
	
	for(int i=0; i<arr.length; i++){
		if(i != arr.length-1){
			if(arr[i]>arr[i+1]){
			
			int temp;
			temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
			
			i=-1;
		}}
	}
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Which position largest number you want?");
	int num= sc.nextInt();
	System.out.println("The "+num+"th largest number is :"+arr[(arr.length)-num]);
	}
}