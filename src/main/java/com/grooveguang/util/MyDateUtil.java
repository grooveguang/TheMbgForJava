package com.grooveguang.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateUtil {
	
	public static String getNowDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String str = df.format(new Date());
		return str;
	}
	
	public static String changeDateToString(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//设置日期格式
		String str = df.format(date);
		return str;
	}
	

}
