package com.privalia.dao;

import java.io.IOException;
import java.util.UUID;

import com.privalia.model.Student;

public interface IDao<T> {
	
	String id = null;
	
	int add(T model) throws IOException;
}
