package org.tnsindia.DateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
		
          LocalTime t=LocalTime.now(ZoneId.of("Europe/Helsinki"));
          System.out.println(t);
          for(String s:ZoneId.getAvailableZoneIds())
          {
        	  System.out.println(s);
          }
	}

}
 