public class ArrayDuplication{
	//Array duplication using one loop
	public static void main(String[] args){
		int[] arr = {1,5,2,10,2,3,1,5};

		for(int i=1,j=0; i<arr.length; i++){
		
		if(arr[j] == arr[i]){
			System.out.println(arr[j]);
			j++;
			i=j+1;
		}
			if(i==arr.length-1){
			j++;
			i=j+1;
			}
		}
	}

}