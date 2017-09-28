package com.privalia.util;

import java.io.FileWriter;
import java.io.IOException;
import org.apache.log4j.Logger;
import java.io.File;

public class FileUtil {
	
	protected Logger logger;
	protected FileWriter writer;
	protected File file;
	
	public FileUtil() {
		logger = Logger.getLogger(FileUtil.class);
	}

	public void create(String fileName)
	{
		try {
			file = new File(fileName);
			
			if (file.exists()) {
				writer = new FileWriter(file, true);
			} else if (file.createNewFile()) {
				writer = new FileWriter(file);
			}
		} catch (IOException e) {
			logger.error(e.getMessage());
		} 
		
	}
	
	public void write(String text) {
		try {
			writer.write(text);
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}
	
	public void close()
	{
		try {
			writer.flush();
			writer.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}
}
