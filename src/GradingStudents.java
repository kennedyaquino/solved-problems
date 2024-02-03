import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.IntStream;

public class GradingStudents {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();

	}
	
	class Result {

	    /*
	     * Complete the 'gradingStudents' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts INTEGER_ARRAY grades as parameter.
	     */

	    public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here

	    	for(int i=0; i<grades.size(); i++) {
	    		int n = grades.get(i);
	    		int f = (n + 4) /5 * 5;
    			
	    		if(f >= 40) {
	    			if((f - n) < 3) {
	    				grades.set(i, f);
	    			} 
	    		}
    			
	    	}
	    	
	    	return grades;
	    }

	}

}
