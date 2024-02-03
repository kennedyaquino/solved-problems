import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class ConverterTimeToText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN

        int sec = Integer.parseInt(name);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.SECOND, sec);
       
        System.out.println(calendar.toString());
      
       int second = calendar.get(Calendar.SECOND);
       int minute = calendar.get(Calendar.MINUTE);
       int hour = calendar.get(Calendar.HOUR);
       int day = calendar.get(Calendar.HOUR) / 24;
       
       final String nameDay = "day";
       final String nameDayPlural = "days";
       final String nameHour = "hour";
       final String nameHourPlural = "hours";
       final String nameMinute = "minute";
       final String nameMinutePlural = "minutes";
       final String nameSecond = "second";
       final String nameSecondPlural = "seconds";
       
       String dayConcat = day + " " + nameDay + ", ";
       String hourConcat = hour + " " + nameHour + ", ";
       String minuteConcat = minute + " " + nameMinute + " and ";
       String secondConcat = second + " " + nameSecond;
       
       
       if(day > 1) {
    	   dayConcat = day + " " + nameDayPlural + ", ";
       } else if(day == 0) {
    	   dayConcat = "";
       }
       
       if(hour > 1) {
    	   hourConcat = hour + " " + nameHourPlural + ", ";
       } else if(hour == 0) {
    	   hourConcat = "";
       }
       
       if(minute > 1) {
    	   minuteConcat = minute + " " + nameMinutePlural + " and ";
       } else if(minute == 0) {
    	   minuteConcat = "";
       }
       
       if(second > 1) {
    	   secondConcat = second + " " + nameSecondPlural;
       } else if(second == 0) {
    	   secondConcat = "now";
       }
       
       
       System.out.println(dayConcat+hourConcat+minuteConcat+secondConcat); 
        
	}

}
