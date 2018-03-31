//package projects.java.java8.lambda;


// A functional interface.
interface NumberTest04 {
  int func(int n);
}

class LambdaExample04_BlockLambda {
  public static void main(String args[]) {
    System.out.println("LambdaExample04_BlockLambda - Start");
       	
	/* Example for Block Lambda
	*/
	
	// A lambda expression that computes factorial of a number.
	NumberTest04 factorial = n -> {
		int result = 1;
		for(int i=1; i <= n; i++)
		result = i * result;
		return result;
	};
	
	System.out.println("The factoral of 3 is " + factorial.func(3));
	System.out.println("The factoral of 5 is " + factorial.func(5));
	
	System.out.println("LambdaExample04_BlockLambda - End");
  }
}
