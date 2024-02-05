import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class AppleAndOrange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
	}
	
	class Result {

	    /*
	     * Complete the 'countApplesAndOranges' function below.
	     *
	     * The function accepts following parameters:
	     *  1. INTEGER s
	     *  2. INTEGER t
	     *  3. INTEGER a
	     *  4. INTEGER b
	     *  5. INTEGER_ARRAY apples
	     *  6. INTEGER_ARRAY oranges
	     */

	    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
	    	// Write your code here
	    	int resultApples = 0;
	    	int resultOranges = 0;
	    	
	    	for(Integer apple: apples) {
	    		int result =  a + apple;
	    		
	    		if(result >= s && result <= t) {
	    			resultApples++;
	    		}
	    	}
	    	
	    	for(Integer orange: oranges) {
	    		int result =  b + orange;
	    		
	    		if(result >= s && result <= t) {
	    			resultOranges++;
	    		}
	    	}
	    	
	    	System.out.println(resultApples);
	    	System.out.println(resultOranges);

	    }

	}

}
