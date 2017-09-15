package com.grooveguang.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MyUploadUtil {

	public static List<String> upload_image(MultipartFile[] files) {
		List<String> img_names = new ArrayList<String>();

		String path = MyPropertyUtil.getProperty("windows_path", "uploadFile.properties");
		for (int i = 0; i < files.length; i++) {
			if(!files[i].isEmpty()){
				String originalFilename = files[i].getOriginalFilename();
				
				String img_name = System.currentTimeMillis() + originalFilename;
				img_names.add(img_name);
				
				String upload_path = path + img_name;
				
					try {
						files[i].transferTo(new File(upload_path));
					} catch (IllegalStateException | IOException e) {
						e.printStackTrace();
					}
				
			}
		}
		return img_names;
	}

}
