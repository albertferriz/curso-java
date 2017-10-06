package com.privalia.dao;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.privalia.model.Student;
import com.privalia.util.FileUtil;

public class StudentDao implements IDao<Student>, INio<Student> {
	
	protected FileUtil fileUtil;
	
	public StudentDao(FileUtil fileUtil)
	{
		this.fileUtil = fileUtil;
		
	}
	
	@Override
	public int add(Student student) 
	{
		this.fileUtil.create("src/main/resources/ficheroDeAlumnos.txt");
		this.fileUtil.write(student.toString() + "\n");
		this.fileUtil.close();
		
		return 0;
	}

	@Override
	public int addWithNio(Student student) throws IOException {
		Path path = Paths.get("src/main/resources/ficheroDeAlumnos.txt"); 
		
		try(BufferedWriter writer = Files.newBufferedWriter(
				path, 
				Charset.forName("UTF-8"), StandardOpenOption.APPEND)) 
		{
			writer.write(student.toString());
			writer.write(System.lineSeparator());
		} catch (IOException e) {
			//logger.error(e.getMessage());
			throw e;
		}
		
		return student.getIdStudent();
	}

}
