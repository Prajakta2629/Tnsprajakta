package org.tnsindia.DateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example5 {

	public static void main(String[] args) {
		
           //String x="14-10-2022 15:45";
           //DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
           //LocalDateTime l=LocalDateTime.parse(x,df);
           LocalDateTime l1=LocalDateTime.now();
           DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
           String x1=l1.format(df1);
           System.out.println(x1);
	}

}
