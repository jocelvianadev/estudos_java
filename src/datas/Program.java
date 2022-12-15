package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("01/12/2022");
		Date y2 = sdf2.parse("01/12/2022 18:34:25");
		Date x1 = new Date();
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
	}

}
