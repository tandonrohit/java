//package projects.java.java8.lambda;


// A functional interface.
interface GenericFunc05<T> {
  T func(T t);
}

class LambdaExample05_Generics {
  public static void main(String args[]) {
    System.out.println("LambdaExample05_Generics - Start");
       	
	/* Example for Generics
	
	   Example with two types, one int and other String, but both take one paramenter and return a result
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
	
	System.out.println("LambdaExample05_Generics - End");
  }
}
