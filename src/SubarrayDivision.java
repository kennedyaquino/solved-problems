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

public class SubarrayDivision {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

	}
	
	class Result {

	    /*
	     * Complete the 'birthday' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY s
	     *  2. INTEGER d
	     *  3. INTEGER m
	     */

	    public static int birthday(List<Integer> s, int d, int m) {
	    // Write your code here
	    
	        int divide = 0;
	        
	        if(s.size() == 1) {
	            if(s.get(0) == d) {
	                divide++;
	            }
	        } else {
	            for(int i=0; i<s.size();i++) {
	                if((i + (m -1)) > s.size() - 1) {
	                    break;
	                }
	                int sum = s.get(i) + s.get(i + (m -1));
	                
	                if(sum == d) {
	                    divide++;
	                } 
	            }
	        }

	        return divide;

	    }

	}

}
