import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class ReverserInteger {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bufferedReader.readLine().trim());
        
        System.out.println(reverse(x));
        
        bufferedReader.close();

	}
	
	private static int reverse(int x) {
		
		long revNumber = 0;
	    long input = x;

	    while (input != 0) {
	        revNumber = revNumber * 10 + input % 10;
	        input = input / 10;
	    }
	    
	    if (revNumber > Integer.MAX_VALUE || revNumber < Integer.MIN_VALUE) {
	        return 0;
	    }
	    return (int) revNumber;
		
	}

}
