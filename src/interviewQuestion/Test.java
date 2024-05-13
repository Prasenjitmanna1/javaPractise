package interviewQuestion;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	
	 public static boolean isApproximately24Hours(String startTimeStr, String endTimeStr) {
	        LocalTime startTime = LocalTime.parse(startTimeStr);
	        LocalTime endTime = LocalTime.parse(endTimeStr);

	        // Calculate the duration between the start time and end time
//	        long hoursBetween = ChronoUnit.HOURS.between(startTime, endTime);
	        long hoursBetween = ChronoUnit.MINUTES.between(startTime, endTime);
	        // Check if the duration is approximately 24 hours
	        return hoursBetween >= 1435;
	    }

 public static void main(String[] args) {
	 
	 
	
	 
	 
	 
	 String schedule = "MON - SUN 00:00AM - 11:59PM";
	 String startTime="";
	 String endTime="";
     // Regular expression to match the time patterns
     Pattern timePattern = Pattern.compile("(\\d{2}:\\d{2})");
     Matcher matcher = timePattern.matcher(schedule);
     
     if (matcher.find()) {
        startTime = matcher.group(1); // Extracts the first time
         if (matcher.find()) {
            endTime = matcher.group(1); // Extracts the second time
             
             // Output the start and end times
             System.out.println("Start Time: " + startTime);
             System.out.println("End Time: " + endTime);
         }
     }
     
     
     System.out.println(isApproximately24Hours(startTime,endTime)); 
}
}
