package interviewQuestion;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ElementCount {

	

		 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of array");
			int n=sc.nextInt();
			String[] arr=new String[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.next();
			}
			
			//adding to Set
			Set<String> set=new LinkedHashSet<>();
			for(String ch:arr) {
				set.add(ch);
			}
			List<String> check=new ArrayList<>(set);

			for(String s:check) {
				int count=0;
				for(String c:arr) {
					if(s.equals(c)) {
						count++;
					}
				}
				System.out.print(s+ "= " +count+" ,");

				}


	 
	}
}
