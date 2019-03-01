package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		int num1;
		num1 = 10;
		try {
			int result = num1/0;// error exception arithmetic      
			System.out.println(result);
		}catch(Exception ex) {// by using exception(try.catch) the program doesn't stop and execute the rest.
				ex.printStackTrace();
				System.out.println("you should not divide a number by zero.");
			   }
		        System.out.println("we are here that means program did not quit ");
	}

}
