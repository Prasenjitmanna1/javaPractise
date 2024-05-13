package interviewQuestion;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Set<Integer> set=new LinkedHashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		System.out.println("The array with the duplicate elements is ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println("");

		for (int n1: set) {
			System.out.print(n1+" ");
		}


	}

}
