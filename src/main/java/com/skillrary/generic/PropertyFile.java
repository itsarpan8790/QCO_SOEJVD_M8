package com.skillrary.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public String getPropertyData(String key) throws Throwable {

		FileInputStream fis = new FileInputStream(IPathConstant.propertyFilePath);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);

	}

}
