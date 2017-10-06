package com.privalia.presentation;

import com.privalia.dao.StudentDao;
import com.privalia.model.Student;
import com.privalia.util.FileUtil;
import com.privalia.util.MethodInfo;
import org.apache.log4j.Logger;
import java.util.Scanner;
import java.util.UUID;

import static java.lang.System.out;

import java.io.FileWriter;

public class Main {
	
	static final Logger logger = Logger.getLogger(Main.class);
	static StudentDao studentDao;
	
	@MethodInfo(
			author="Albert",
			revision = 1,
			comments = "My first comment",
			date ="27/09/2017")
	public static void main(String[] args) {
		
		studentDao = new StudentDao(new FileUtil());
		
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		do {
			out.println("1.- Agregar nuevo alumno");
			out.println("2.- Salir");
			out.print("> ");
			option = scanner.nextInt();
			
			switch (option) {
				case 1:				
					out.println("Nombre: ");
					String nombre = scanner.nextLine();
					out.print("Apellido: ");
					String apellidos = scanner.nextLine();
					out.print("id: ");
					int id = scanner.nextInt();
					out.print("Edad: ");
					int edad = scanner.nextInt();
					
					Student student = new Student(id, nombre, apellidos, edad, UUID.randomUUID());
					studentDao.add(student);
					
					logger.info("Student : " + student.getName() + " Surname" + student.getSurname() + " Age: " + student.getAge());
					break;
				case 2:
					logger.info("Salir");
					break;
					
			}
		} while(option != 2);

	}

}
