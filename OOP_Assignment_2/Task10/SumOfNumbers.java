class SumOfNumbers{
	public int sum(int []arr){
		int totalSum=0;
		for(int i=0; i<arr.length; i++){
			totalSum = totalSum+arr[i];
		}
		return totalSum;
	}
	public int sum(int[] arr, char ch){
		int totalSum=0;
		if(ch=='e' || ch=='E'){
			for(int i=0; i<arr.length; i++){
				if(arr[i]%2==0){
			totalSum = totalSum+arr[i];
				}
		}
		return totalSum;
		}else if(ch=='o' || ch=='O'){
			for(int i=0; i<arr.length; i++){
				if(arr[i]%2!=0){
			totalSum = totalSum+arr[i];
				}
		}
		return totalSum;
		}else
			return 0;
	
	}
	public static void main(String []args){
		SumOfNumbers s = new SumOfNumbers();
	int []arr={1,2,3,7,4,9,10};
	char ch = 'o';
	if(ch=='e' || ch=='E'){
		System.out.println("Sum of even integers: "+s.sum(arr,'e'));
	}else if(ch=='o' || ch=='O'){
		System.out.println("Sum of odd integers: "+s.sum(arr,'o'));
	}else
		System.out.println("Sum of integers: "+s.sum(arr));
	}
}