package wah10.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WAA6 {
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		System.out.println(date);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strDate = sdf.format(date);
		
		System.out.println(strDate);
		
		String yesterday = "2022.12.06 21:12:56";
		
		Date yDate = sdf.parse(yesterday);
		System.out.println(yDate);
		
	}

}
