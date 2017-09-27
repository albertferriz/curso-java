package com.privalia.presentation;

import com.privalia.model.Student;
import com.privalia.util.MethodInfo;
import org.apache.log4j.Logger;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
	
	static final Logger logger = Logger.getLogger(Main.class);
	
	@MethodInfo(
			author="Albert",
			revision = 1,
			comments = "My first comment",
			date ="27/09/2017")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		switch(option = scanner.nextInt()) {
		
			case 1:				
				while(scanner.nextInt() != 2) {
					out.print("nombre: ");
					String nombre = scanner.nextLine();
					out.print("apellido: ");
					String apellidos = scanner.nextLine();
					out.print("id: ");
					int id = scanner.nextInt();
					out.print("Edad: ");
					int edad = scanner.nextInt();
					
					Student student = new Student(id, nombre, apellidos, edad);
					logger.info("Student : " + student.getName() + " Surname" + student.getSurname() 
					+ " Age: " + student.getAge());
					
					out.println("Student 2 Name: " + student.getName());
					
					out.println("1.- Agregar nuevo alumno");
					out.println("2.- Salir");
					out.println("> ");
				}
				break;
			case 2:
				logger.info("Salir");
				break;
				
		}

	}

}
