//package projects.java.java8.lambda;

interface StringFunc {
String func(String n);
}

class LambdaExample06_LambdasAsParm {
  public static void main(String args[]) {
    System.out.println("LambdaExample06_LambdasAsParm - Start");
       	
	/* Example for Lambda Expression as an parameter to a method
	*/
	
	// String-based function
	GenericFunc05<String> reverse = (str) -> {
		String result = "";
		int i;
		for(i = str.length()-1; i >= 0; i--)
			result += str.charAt(i);
		return result;
	};
	System.out.println("Lambda reversed is " + reverse.func("Lambda"));
	System.out.println("Expression reversed is " + reverse.func("Expression"));

	// Integer-based function
	GenericFunc05<Integer> factorial = (n) -> {
		int result = 1;
		for(int i=1; i <= n; i++)
			result = i * result;
		return result;
	};
	System.out.println("The factoral of 3 is " + factorial.func(3));
	System.out.println("The factoral of 5 is " + factorial.func(5));
	
	System.out.println("LambdaExample06_LambdasAsParm - End");
  }
}
