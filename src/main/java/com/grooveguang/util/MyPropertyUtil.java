package com.grooveguang.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropertyUtil {

	public static String getProperty(String string, String property) {

		Properties properties = new Properties();

		InputStream resourceAsStream = MyPropertyUtil.class.getClassLoader().getResourceAsStream(property);

		try {
			properties.load(resourceAsStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String val = properties.getProperty(string);

		return val;
	}

}
