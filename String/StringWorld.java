import java.util.Scanner;
class StringWorld{
	public void reverse(String str){
		char[] strArray = str.toCharArray();
		char[] temp = new char[strArray.length];
		for(int i=strArray.length-1; i>=0; i--){
			temp[strArray.length-1-i]= strArray[i];
		
		}
		
		for(int i=0; i<temp.length; i++){
			System.out.print(temp[i]);
		}
	}
	
	public boolean checkPalindrome(String str){
		char[] strArray = str.toCharArray();
		char[] temp = new char[strArray.length];
		for(int i=strArray.length-1; i>=0; i--){
			temp[strArray.length-1-i]= strArray[i];
		
		}
		
			String str2 = new String(temp);
			if(str2.equalsIgnoreCase(str)){
				return true;
			}
			else
				return false;
	}
	
	public boolean checkAnagram(String str1,String str2){
		
			char[] temp1= str1.toCharArray();
			char[] temp2= str2.toCharArray();
		for(int i=0; i<temp1.length; i++){
			for(int j=0; j<temp1.length; j++){
				
			if(temp1[i]<temp1[j]){
			char temp=temp1[i];
			temp1[i]=temp1[j];
			temp1[j]=temp;
			}
		}
		}
		
		
			for(int i=0; i<temp2.length; i++){
			for(int j=0; j<temp2.length; j++){
				
			if(temp2[i]<temp2[j]){
			char temp=temp2[i];
			temp2[i]=temp2[j];
			temp2[j]=temp;
			}
		}
		}
	String str3 = new String(temp1);
	String str4 = new String(temp2);
	if(str3.equalsIgnoreCase(str4)){
		return true;
	}else
		return false;
	}
	
	public void dignoseString(String str){
		//Size of String
		System.out.println("Size: "+str.length());
		//No. of vowels, Consonants and Spaces
		str.toLowerCase();
		char[] temp= str.toCharArray();
		int countA=0;
		int countE=0;
		int countI=0;
		int countO=0;
		int countU=0;
		int countConsonants=0;
		int countSpaces=0;
		for(int i=0; i<temp.length; i++){
			if(temp[i]=='a'){
				if(countA==0)
					countA++;
			}else if(temp[i]=='e'){
				if(countE==0)
					countE++;
			}else if(temp[i]=='i'){
				if(countI==0)
					countI++;
			}else if(temp[i]=='o'){
				if(countO==0)
					countO++;
			}else if(temp[i]=='u'){
				if(countU==0)
					countU++;
			}else if(temp[i]==' '){
				countSpaces++;
			}
			else{
				countConsonants++;
			}
		}
		System.out.println("Total Vowels : "+(countA+countE+countI+countO+countU));
		System.out.println("Total Consonants : "+ countConsonants);
		System.out.println("Total Spaces : "+ countSpaces);
		
		
	}

	//Frequency of Letters
	public void frequency(String str1){
		char[] temp1= str1.toCharArray();
		//	char[] temp2= str2.toCharArray();
		int count=0;
		
		for(int i=0; i<temp1.length; i++){
			for(int j=0; j<temp1.length; j++){
				if(temp1[i]==temp1[j]){
					count++;
				}
			}
			System.out.println(temp1[i]+" = "+count);
			count=0;
		}
	
	}
	
	public static void main(String []args){
	System.out.println("Welcome to the String World!!");
	boolean check=true;
	while(check){
	System.out.println("Which String operation do you want to perform?");
	System.out.println("1- Reverse a String");
	System.out.println("2- Check Palindrome");
	System.out.println("3- Check Anagram");
	System.out.println("4- Dignose String\n   Size\n   Total Vowels\n   Total Consonants\n   Total Spaces");
	System.out.println("5- Check Frequency of letters");
	System.out.println("------------------------");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	sc.nextLine();
	String str1="";
	String str2="";
	if(choice==3){
		System.out.println("Enter two string:");
		str1 = sc.nextLine();
		str2 = sc.nextLine();
	}else{
		System.out.println("Enter string:");
		str1 = sc.nextLine();
	}
	
	StringWorld sw = new StringWorld();
	
	switch(choice){
		case 1:
		{
			sw.reverse(str1);
			break;
		}
		case 2:
		{
			if(sw.checkPalindrome(str1)==true){
			System.out.println("It is Palindrome");
			}
			else{
			System.out.println("It is not Palindrome");
		}
			break;
		}
		case 3:
		{	
			if(sw.checkAnagram(str1,str2)==true){
			System.out.println("The two Strings are Anagram of eachother");
			}
			else{
			System.out.println("The two Strings are not Anagram of eachother");
		}
			
			break;
		}
		case 4:
		{
			sw.dignoseString(str1);
			break;
		}
		case 5:
		{
			sw.frequency(str1);
			break;
		}
		default:
		{
			System.out.println("Invalid Choice!!!");
		}
		
	}
	System.out.println("---------------------");
	System.out.println("Do you want to perform another operation:");
	System.out.println("Press y to continue and n to exit:");
	char ch = sc.next().charAt(0);
	if(ch=='y' || ch=='Y'){
		check=true;
	}else
		check=false;
	
	}
	}
	
	
}