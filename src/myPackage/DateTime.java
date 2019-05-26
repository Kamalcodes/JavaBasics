package myPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateTime
{
	public static void main(String  args[])
	{
			//Example 1
//		Date d=new Date();
//		String strDateFormat="YYYY/MM/DD:::HH:mm:ss a";
//		SimpleDateFormat sdf=new SimpleDateFormat(strDateFormat);
//		System.out.println(sdf.format(d));
		
			//Example 2
//		Date d=new Date();
//		System.out.println(d.toString());
		
		
			//Example 3
		Formatter fmt=new Formatter();
		Calendar cal=Calendar.getInstance();
		fmt=new Formatter();
		fmt.format("%tc",cal);
		System.out.println(fmt);
		 
	}
}
