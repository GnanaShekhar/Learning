package beta_basics;

public class UsingArrays {

	public static void main(String[] args) {
		/* Declaring arrays in three ways */
		int[] int_arr;
		char []char_arr= {'a','e','i','o','u'};  
		String string_arr[];
		
		/* Instantiating */
		int_arr = new int[5]; // size final
		System.out.println(int_arr[0]); //by default all values in int_arr are set to 0
		int_arr[0]=1; //inserting
		System.out.println(int_arr[0]); 
		
		/* updating array using for loop */
		for(int i =0; i<int_arr.length;i++) {
			int_arr[i]=i*2;			
		}		
		
		/* printing using foreach */
		for(char x:char_arr) {
			System.out.print(x+" ");
		}
		
		/* adding character array as string to string array */
		string_arr = new String[5];
		string_arr[0]=String.valueOf(char_arr);
		System.out.println("\n"+string_arr[0]);
		
		/* multi dimensional array*/
		int[][] int_multi_arr; // other ways of declaring  int [][]int_multi_arr; (or) int int_multi_arr[][]; (or) int []int_multi_arr[];
		int_multi_arr = new int[3][3]; // also int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		int_multi_arr[0][0]=1; //using index
		
		for(int i = 0; i<int_multi_arr.length; i++) {
			for(int j = 0; j<int_multi_arr[i].length; j++) {
				int_multi_arr[i][j]=i+j;
				System.out.println(i+","+j+" is "+int_multi_arr[i][j]);
			}
		}
		
		/*declaring a 2D array with odd columns*/  
        int arr_x[][] = new int[3][];  
        arr_x[0] = new int[3];  
        arr_x[1] = new int[4];  
        arr_x[2] = new int[2];  
        
        /*copy partial array*/
        char[] a = new char[3];
        System.arraycopy(char_arr, 2, a, 0, 3);
        System.out.println(String.valueOf(a));  //printing char array as string
        
        //Cloning array
        int new_int_arr[]=int_arr.clone();
		
	}

}
