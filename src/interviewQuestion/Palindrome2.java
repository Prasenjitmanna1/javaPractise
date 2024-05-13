package interviewQuestion;

import java.util.Scanner;

public class Palindrome2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.next();
		String temp="";
		
		char c;
		for(int i=0;i<input.length();i++) {
			c=input.charAt(i);
			temp=c+temp;//it adds the character prior to the temp String
			System.out.println(temp);
		}
		System.out.println("The reversed string is: "+temp);
		if(input.equalsIgnoreCase(temp)) {
			System.out.println(input+" is a palindrome");
		}
		else {
			System.out.println(input+" is not a palindrome");
		}
	}

}
