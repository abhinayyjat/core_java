package co.inTest1;

public class ReverseString {
	public static void main(String[] args) {
	String originalString = "abhinay jat";
	String reversedString = reverse(originalString);
	System.out.println("Original string: " + originalString);
	System.out.println("Reversed string: " + reversedString);	
	}
   public static String reverse(String str) {
	   StringBuilder reversed = new StringBuilder();
	   String[] words = str.split("");
	   for(int i = words.length - 1; i>=0; i--) {
		   reversed.append(words[i]).append("");
	   }
	   return reversed.toString().trim();
   }
}
