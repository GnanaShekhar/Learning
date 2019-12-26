package beta_basics;

public class UsingFunctions {
	
	/* Sample Function/Method */
	static void display_default() {
		System.out.println("Hi, my name is Robert!");
	 }
	
	/* Method with parameters*/
	static void display_values(int a, String s) {
		System.out.println("Number is "+a);
		System.out.println("String is "+s);
	 }
	
	/* Method Overloading*/
	static void display_values(int a, String s, boolean b) {
		System.out.println("Number is "+a);
		System.out.println("String is "+s);
		System.out.println("Boolean is "+b);
	 }
	
	/* Method with return type*/
	static int product(int a, int b) {
		return a*b;		
	}
	/* method overriding with parameter type */
	static int product(double a, double b) {
		return (int) (a*b);		//explicit type casting
	}
	
	
	public static void main(String[] args) {
		display_default();
		display_values(1,"One");
		display_values(2,"Two",true);
		
		System.out.println(product(2,2));
		System.out.println(product(2.0,2.7));
	}

}
