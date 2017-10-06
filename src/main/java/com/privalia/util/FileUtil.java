package com.privalia.util;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

import java.io.BufferedWriter;
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
		Path path = Paths.get(file.getPath());
		
		try(BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"))){
			writer.write(text);
		} catch(IOException ex){
			ex.printStackTrace();
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
