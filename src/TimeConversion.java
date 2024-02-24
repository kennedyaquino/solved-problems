import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
        
	}
	
	class Result {

	    /*
	     * Complete the 'timeConversion' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts STRING s as parameter.
	     */
		
		

	    public static String timeConversion(String s) {
	    // Write your code here
	    	String result = "";    	
	    	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssaa");   	
	    	SimpleDateFormat outSdf = new SimpleDateFormat("HH:mm:ss");
	    	
	    	try {
	    		Date date = sdf.parse(s);
	    		result = outSdf.format(date);
	    		
	    	} catch (ParseException e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return result;
	    }

	}

}
