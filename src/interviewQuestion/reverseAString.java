package interviewQuestion;

public class reverseAString {
	
	 public static void main (String[] args) {
	       
	        String str= "Manna", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println(str); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	   
	        nstr= ch+nstr; //adds each character in front of the existing string
	        //naM
	      
	  
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }

}



