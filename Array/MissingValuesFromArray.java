public class MissingValuesFromArray{
	//Finding Missing valus using one loop
	public static void main(String []args){
		int[] arr = {3,2,11,4,5,9}; 
		boolean check = false;
		for(int i=0; i<arr.length; i++){
			
			if(i != arr.length-1){
			if(arr[i] > arr[i+1]){
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			}
			
			if(i == arr.length-1){
				check = true;
				i=0;
			}
			if(check){
				
			if(i != arr.length-1){
			if(arr[i+1] != arr[i]+1){
				System.out.println(arr[i]+1);
			}
			if(i == arr.length-2){
					i=arr.length;
				}
			}
			}	
		}}}