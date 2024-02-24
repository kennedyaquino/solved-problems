import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SalesByMatch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

	}
	
	class Result {

	    /*
	     * Complete the 'sockMerchant' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER_ARRAY ar
	     */

	    public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
	        int pairs = 0;
	        Map<Integer, Integer> colors = new HashMap<>();
	    
	        for(int i=0; i<ar.size(); i++) {
	            if(!colors.containsKey(ar.get(i))) {
	                colors.put(ar.get(i), 0);
	            }
	        }
	        
	        for(int i=0; i<ar.size(); i++) {
	            int value = colors.get(ar.get(i));
	            value++;
	            
	            if(value == 2) {
	                pairs++;
	                value = 0;
	            }
	            
	            colors.replace(ar.get(i), value);
	            
	        }
	    
	        return pairs;

	    }

	}

}
