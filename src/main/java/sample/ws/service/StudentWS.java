package sample.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import sample.ws.bussines.StudentService;
import sample.ws.model.Student;
import sample.ws.model.StudentDto;

@WebService(targetNamespace = "http://sample", name = "StudentWS")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = Use.LITERAL)
// @SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=Use.LITERAL)

public interface StudentWS {
	
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "getStudentByIdRequest", targetNamespace = "http://sample", className = "")
	@WebMethod(action = "urn:GetStudentById")
	@ResponseWrapper(localName = "getStudentByIdResponse", targetNamespace = "http://sample", className = "sample.ws.model.Student")
	public Student getStudentById(@WebParam(name = "id") Long id);

	
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "addStudentRequest", targetNamespace = "http://sample", className = "")
	@WebMethod(action = "urn:AddStudent")
	@ResponseWrapper(localName = "addStudentResponse", targetNamespace = "http://sample", className = "sample.ws.model.Student")
	public Student addStudent(Student s);

}
