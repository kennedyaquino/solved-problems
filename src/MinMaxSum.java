import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
	}
	
	class Result {

	    /*
	     * Complete the 'miniMaxSum' function below.
	     *
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */

	    public static void miniMaxSum(List<Integer> arr) {
	    	
	    // Write your code here
	    long sum = arr.stream().collect(Collectors.summingLong(Integer::intValue)).longValue();
	    long max = 0;
	    long min =0;
	    
	    for(int i=0; i< arr.size(); i++) {
	    
	       long result = new BigDecimal(sum).subtract(new BigDecimal(arr.get(i))).longValue();
	       
	       
	       if(max == 0) {
	           max = result;
	       } 
	       
	       if(min == 0) {
	           min = result;
	       }
	       
	       if(max != 0 && result > max) {
	           max = result;
	       } else if(min != 0 && result < min) {
	           min = result;
	       }

	    }	 
	    System.out.println(min + " " + max);

	    }

	}
	
}
