//package projects.java.java8.lambda;


// A functional interface.
interface NumberTest03 {
  boolean test(int n, int d);
}

class LambdaExample03 {
  public static void main(String args[]) {
    System.out.println("LambdaExample03 - Start");
       	
	/* Example with multiple parameters
	*/
	
	// A lambda expression that determines if number is factor of other.
	NumberTest03 isFactor = (n, d) -> (n % d) == 0;
	
	if(isFactor.test(10, 2)) System.out.println("2 is a factor of 10");
	else System.out.println("2 is not a factor of 10");
	
	if(isFactor.test(10, 3)) System.out.println("3 is a factor of 10");
	else System.out.println("3 is not a factor of 10");
	
	System.out.println("LambdaExample03 - End");
  }
}
