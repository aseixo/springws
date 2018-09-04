package sample.ws.service;

import javax.jws.WebService;

import sample.ws.model.Student;

@WebService(targetNamespace= "http://service.ws.sample", name = "StudentWebService")
public interface StudentWS {
	
	public Student getStudentById(long id);

}
