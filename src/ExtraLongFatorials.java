import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ExtraLongFatorials {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();

	}
	
	class Result {

	    /*
	     * Complete the 'extraLongFactorials' function below.
	     *
	     * The function accepts INTEGER n as parameter.
	     */

	    public static void extraLongFactorials(int n) {
	    // Write your code here
	        
	        BigInteger result = new BigInteger(String.valueOf(n));
	        int count = n;
	        int index = 1;
	        
	        while(count > 1) {
	        	int sub = n - index;
	        	result = result.multiply(new BigInteger(String.valueOf(sub)));
	            count--;
	            index++;
	        }
	        
	        System.out.println(result);

	    }

	}

}
