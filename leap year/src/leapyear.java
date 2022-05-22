
public class leapyear {

	public static void main(String[] args) {
		      int yr;
		      
		      System.out.println("Enter an Year: ");
		      Scanner sc = new Scanner(System.in);
		      
		      yr = sc.nextInt();

		      if (((yr % 4 == 0) && (yr % 100!= 0)) || (yr % 400 == 0))
		         System.out.println("Year is a leap year");
		      else
		         System.out.println("Year is not a leap year");
		
	}

}
