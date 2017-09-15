package com.grooveguang.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		
		String str = df.format(new Date());
		
		
		System.out.println(str);// new Date()为获取当前系统时间
		Date date =new Date();
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(date);
		System.out.println(currentTimeMillis);
		
		
	}

}
