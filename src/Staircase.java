import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        Result.staircase(n);

	        bufferedReader.close();

	}
	
	class Result {

	    /*
	     * Complete the 'staircase' function below.
	     *
	     * The function accepts INTEGER n as parameter.
	     */

	    public static void staircase(int n) {
	    // Write your code here
	    
	    	String[] arr = new String[n];
		    	
		    for(int i=0; i<n; i++) {
		        arr[i] = " ";  
		    }
		    
		    for(int i=n; i>0; i--) {
		    	arr[i-1] = "#";
		    	for(int j=0; j<arr.length; j++) {
		    		System.out.print(arr[j]);
		    	}
		    	System.out.println();
		    }
	    }

	}

}
