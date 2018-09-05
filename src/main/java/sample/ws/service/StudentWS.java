package sample.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import sample.ws.model.Student;

@WebService(targetNamespace = "http://service.ws.sample/", name = "StudentWS")
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public interface StudentWS {

	@WebResult(name = "return", targetNamespace = "")

	@RequestWrapper(localName = "getStudentByIdRequest", 
		targetNamespace = "http://service.ws.sample/", 
		className = "java.lang.Long")

	@WebMethod(action = "urn:GetStudentById")

	@ResponseWrapper(localName = "getStudentByIdResponse", 
		targetNamespace = "http://service.ws.sample/",
		className = "sample.ws.model.Student")
	

	public Student getStudentById(@WebParam(name = "id", targetNamespace = "") Long id);
	
	@WebResult(name = "return", targetNamespace = "")

	@RequestWrapper(localName = "getServiceNameRequest", 
		targetNamespace = "http://service.ws.sample/")

	@WebMethod(action = "urn:GetServiceName")

	@ResponseWrapper(localName = "getServiceNameResponse", 
		targetNamespace = "http://service.ws.sample/",
		className = "java.lang.String")
	
	
	public String getServiceName();
}
