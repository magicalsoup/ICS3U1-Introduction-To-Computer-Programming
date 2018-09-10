/**
 * @author amagicalsoup
 * @author James Su
 * @Teacher Ms. Leung's class
 * @ClassCode ICS3U
 * @class Basic Output
 * @Date September 6th, 2018
 */
public class OutputAssignment {
	public static void main(String[]args) {
		//Out 1
			// a) a comment is in green color, but it depends on the IDE, but in Dr.java its green
			// b) a reserved work is in blue color, also depends on the IDE, but in Dr.java its red
		
		// Out 2
			// prints numbers from 12 to 15 included, each on a separate line
			System.out.println(12);
			System.out.println(13);
			System.out.println(14);
			System.out.println(15);
		
		//Out 3
			// prints my first and last name
			String first = "James";
			String last = "Su";
			System.out.println(first+" "+last);
			
		// Out 4
			// prints a combined string
			String a = "The area code for Toronto is ";
			String b = "416";
			System.out.println(a+b);
			
		// Out 5
			// prints the product of 3*4
			int product = 3*4;
			System.out.println(product);
			
		// Out 6
			// prints the remainder of 5/2
			int rem = 5%2;
			System.out.println(rem);
			
		// Out 7
			// prints Hello 10 times each on a separate line
			for(int i = 0; i < 10; i++) {
				System.out.println("Hello");
			}
	}
}
