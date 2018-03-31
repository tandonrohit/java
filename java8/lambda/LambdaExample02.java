//package projects.java.java8.lambda;


// A functional interface.
interface NumberTest {
  boolean test(int n);
}

class LambdaExample02 {
  public static void main(String args[]) {
    System.out.println("LambdaExample02 - Start");
       	
	/* A functional interface reference can be used to execute any lambda expression that is
	   compatible with it. Notice that the program defines two different lambda expressions that
	   are compatible with the test( ) method of the functional interface
	*/
	
	// With single parm () is ot needed. So in below example "n -> (n % 2)==0;" should be fine too
	
	// A lambda expression that tests if a number is even.
	NumberTest isEven = (n) -> (n % 2)==0;
	if(isEven.test(4)) System.out.println("4 is even"); else System.out.println("4 is odd");
	if(isEven.test(5)) System.out.println("5 is even"); else System.out.println("5 is odd");
	
	// Now, use a lambda expression that tests if a number is non-negative.
	NumberTest isNonNeg = (n) -> n >= 0;
	if(isNonNeg.test(1)) System.out.println("1 is non-negative");
	if(!isNonNeg.test(-1)) System.out.println("-1 is negative");
	
	System.out.println("LambdaExample02 - End");
  }
}
