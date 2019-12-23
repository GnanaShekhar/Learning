package beta_basics;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Sir!");
		
		/*Using Variables*/
		int a = 5;
		float b = 10; //other types: char boolean String double short byte
		
		/*Using operators and type casting*/
		System.out.println("Sum is "+(a+b)); //automatic type casting
		System.out.println("Sum is "+(a*b)); //other arithmetic operators: - / %  ++ -- ^ 
		b += a; //other Assignment operators like *= %= >>= <<= etc.
		
		/*Using String functions and string concatination using operators*/
		String txt = "Hi I'm Robert, your virtual Assistant";
		System.out.println("The length of the txt string is: " + txt.length());// String functions txt.toUpperCase() txt.indexOf("Virtual")
		
		/*Using Math class*/
		System.out.println(Math.max(5, 10)); // Math functions Math.sqrt(64); Math.abs(-4.7); Math.random();
		
		/*Using if, else, else if*/
		if(a>b)
			System.out.println(a+" is greater than "+b);
		else if(a==b)
			System.out.println(a+" is equal to "+b);
		else
			System.out.println(b+" is greater than "+a);
		
		/*Using arrays*/
		int arr[]= {1,2}; // array
		
		/*Using normal for loop*/
		for(int i=0; i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n"); //as print doesn't have \n next print will start at the end of print out put.
		// updating array or inserting
		arr[0]=3;
		
		int arr2[] = {0,1,2,3,4,5,6,7,8,9}; // array other ways to declare: int[] arr={1,2};
		
		/*Using for each loop*/
		for(int x:arr2) {
			switch(x) { // switch case and using break
			case 5: System.out.println("x concatains 5"); break;
			case 7: System.out.println("x concatains 7"); break;
			case 12: System.out.println("x concatains 12"); break;
			default: break;
			}
		}
		
		/*Using for while loop*/
		int j = 0;
		while(j < arr2.length) {
			if(j>5)
				System.out.print(arr2[j]+" ");
			j+=1;
		}
		
		/*Using for do while loop*/
		do { // this loop will run atleast once
			if(j>5)
				System.out.print(arr2[j]+" ");
			j+=1;
		}while(j < arr2.length);
	}

}
