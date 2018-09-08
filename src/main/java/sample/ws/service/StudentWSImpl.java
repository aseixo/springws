package sample.ws.service;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sample.ws.bussines.StudentService;
import sample.ws.model.Student;


@javax.jws.WebService(serviceName = "StudentWebService", 
portName = "StudentPort", 
targetNamespace = "http://ws.sample/service", 
endpointInterface = "sample.ws.service.StudentWS")

public class StudentWSImpl implements StudentWS {

	private static Logger logger = LoggerFactory.getLogger(StudentWSImpl.class);

	@Resource
	private StudentService studentService;
	
	public Student getStudentById(Long id) {
		
		//ConverterUtils c = new ConverterUtils();
		Student st = new Student();
		st = this.studentService.getStudentById(id);
		logger.info(st.toString());
		return st;
	}

	@Override
	public Student addStudent(Student s) {
		
		Student student =  studentService.add(s);
		logger.info(student.toString());
		return s;
	}
}
