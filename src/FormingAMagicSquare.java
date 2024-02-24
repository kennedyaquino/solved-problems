import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FormingAMagicSquare {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}

	class Result {

	    /*
	     * Complete the 'formingMagicSquare' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts 2D_INTEGER_ARRAY s as parameter.
	     */

	    public static int formingMagicSquare(List<List<Integer>> s) {
	    // Write your code here

	    	int[][][] p = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
							{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
							{{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
							{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
							{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
							{{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
							{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
							{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};
	    	int min = 100;

	    	for(int i=0; i<8; i++) {
	    		int diff = 0;

	    		for(int j=0; j<3; j++) {
	    			for(int k=0; k< 3; k++) {
	    				diff += Math.abs(p[i][j][k] - s.get(j).get(k));
	    			}
	    		}
	    		if(diff < min) {
					min = diff;
				}
	    	}

	    	return min;
	    }

	}

}
