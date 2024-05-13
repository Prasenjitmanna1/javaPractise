package interviewQuestion;


//Without using 3rd variable
public class swapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

	    System.out.println("a is " + a + " and b is " + b);

		a = a + b; //a=30
		b = a - b; //b=30-20 = 10 
		a = a - b; //a= 30-10 = 20

	    System.out.println("After swapping, a is " + a + " and b is " + b);
	    }

}

