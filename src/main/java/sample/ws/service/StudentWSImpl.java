package sample.ws.service;

import sample.ws.model.Student;

@javax.jws.WebService(serviceName = "StudentWebService", portName = "StudentPort", targetNamespace = "http://service.ws.sample/", endpointInterface = "sample.ws.service.StudentWS")

public class StudentWSImpl implements StudentWS {

	public Student getStudentById(long id) {

		return new Student(2, "Olga María", "olgamfi@gmail.com", 3);
	}

}
