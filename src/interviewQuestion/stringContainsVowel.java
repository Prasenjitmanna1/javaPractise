package interviewQuestion;

public class stringContainsVowel {

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}


		public static void main(String[] args) {
			System.out.println(stringContainsVowels("Hello")); // true
			System.out.println(stringContainsVowels("TV")); // false
		}

	

}
