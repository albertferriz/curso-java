package com.privalia.dao;

import com.privalia.model.Student;
import com.privalia.util.FileUtil;

public class StudentDao implements IStudentDao {
	
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

}
