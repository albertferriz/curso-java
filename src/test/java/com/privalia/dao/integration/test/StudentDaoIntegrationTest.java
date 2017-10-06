package com.privalia.dao.integration.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Properties;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.privalia.dao.INio;
import com.privalia.dao.StudentDao;
import com.privalia.model.Student;

public class StudentDaoIntegrationTest {
	
	static final Logger logger = Logger.getLogger(StudentDaoIntegrationTest.class);
	
	static Properties prop = null;
	static FileInputStream input;
	
	@BeforeClass
	public static void setup() {
		prop = new Properties();
		
		try {
			input = new FileInputStream("");
			prop.load(input);
		} catch (IOException e) {
			logger.error(e.getMessage());
			throw new ExceptionInInitializerError(e);
		}
	}
	
	
	@Test
	public void testAddWithNio() throws IOException {
		
		Student studentSent = new Student(1, "albert", "ferriz", 33, UUID.randomUUID());
		INio<Student> studentDaoNio = new StudenDao();
		studentDaoNio.addWithNio(studentSent);
		
		Student studentFoundWithNio = findAlumnoWithNio(
				studentSent.getIdStudent());
		
		assertEquals(studentFoundWithNio, studentSent);
	}


	private Student findAlumnoWithNio(int idStudent) throws IOException{
		Student student = null;
		
		try (
				RandomAccessFile randomAccessFile = new RandomAccessFile("alumno.txt", "rw");
				FileChannel fileChannel = randomAccessFile.getChannel();
				
				ByteBuffer byteBuffer = ByteBuffer.allocate(512);
				StringBuffer line = new StringBuffer();
				String[] alumnoString = null;
				boolean finished = null;
				
				while(fileChannel.read(byteBuffer) > 0 && !finished) {
					//byteBuffer.rewind();
					//System.out.print(charset.decode(byteBuffer));
					byteBuffer.flip();
					
					for (int i = 0; i < byteBuffer.limit(); i++) {
						char ch = ((char) byteBuffer.get());
						
						if (ch ==  "\n") {
							String stringLine = line.toString();
							alumnoString
						}
						
					}
					}
					
				}
				
				
				)
		
		return null;
	}
}
