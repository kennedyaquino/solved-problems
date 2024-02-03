import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class BirthdayCakeCandles {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);
        
        System.out.println(result);
        
        bufferedReader.close();
        

	}
	
	class Result {

	    /*
	     * Complete the 'birthdayCakeCandles' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY candles as parameter.
	     */

	    public static int birthdayCakeCandles(List<Integer> candles) {
	    // Write your code here
	    int n = 0;
	    
	    int max = candles.stream().max(Integer::compare).get();
	    
	    for (Integer a : candles) {
			if(max == a) {
				n++;
			}
		}

	    return n;
	    

	    }

	}

}
