package tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileAnalyzer {

	public static void main(String[] args) {
		String path = "C:\\Users\\DELL\\eclipse-workspace\\File handling\\src\\tasks\\sample.txt";
		analyze(path);
	}
	
	// This method count No of Vowels
	public static void analyze(String path) {
		File file = new File(path);
		
		BufferedReader br = null;
		Scanner sc = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		int i;
		int vowels = 0;
		int consonants = 0;
		int spaces = 0;
		int palindrome = 0;
		try {
			while((i=br.read()) !=-1) {
				char ch = (char)i;
				if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'
					|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
					vowels++;
				}else if(ch==' ') {
					spaces++;
				}else {
					consonants++;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		List<String> list = new ArrayList<>();
		 
		try {
			sc = new Scanner(new FileReader(file));
			
			while(sc.hasNext()) {
				String word = sc.next();
				char ch[] = word.toCharArray();
				char temp[] = new char[ch.length];
				int k=0;
				for(int j=ch.length-1; j>=0; j--) {
					temp[k]=ch[j];
					k++;
					
				}
				
				String str = new String(temp); // converting array to String
				list.add(str);			// add to list
				
				if(word.equals(str)){
					palindrome++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("No. of Vowels: "+vowels);
		System.out.println("No. of Consonants: "+consonants);
		System.out.println("No. of Spaces: "+spaces);
		System.out.println("No. of Palindrome: "+palindrome);
		System.out.println("List of Reverse of each word in file: ");
		for(String s:list) {
		System.out.println(s);
		}
		
		
	}
	

}
