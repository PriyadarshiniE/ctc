import java.util.Arrays;
import java.util.Scanner;
public class main 
{
		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter first String:");
		    String A = input.nextLine();
		    System.out.print("Enter second String:");
		    String B = input.nextLine();
		    // check if length is same
		    if(A.length() == B.length()) {
		      // convert strings to char array
		      char[] charArray1 = A.toCharArray();
		      char[] charArray2 = B.toCharArray();
		      // sort the char array
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      // if sorted char arrays are same
		      // then the string is anagram
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println("Anagram");
		      }
		      else {
		        System.out.println("Not Anagram");
		      }
		    }
	}
}