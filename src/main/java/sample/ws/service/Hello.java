package sample.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace= "http://service.ws.sample", name = "Hello")
public interface Hello {

	/*@WebResult(name= "return", targetNamespace = "")
	@RequestWrapper(localName= "sayHello",
			targetNamespace= "http://service.ws.sample/", 
			className = "sample.ws.service.SayHello")
	@WebMethod(action = "urn:SayHello")
	@ResponseWrapper(localName = "sayHelloResponse",
			targetNamespace= "http://service.ws.sample/", 
			className = "sample.ws.service.SayHelloResponse")*/
	
	@WebResult(name= "return", targetNamespace = "")
	@RequestWrapper(localName= "sayHello",
			targetNamespace= "http://service.ws.sample/", 
			className = "")
	@WebMethod(action = "urn:SayHello")
	@ResponseWrapper(localName = "sayHelloResponse",
			targetNamespace= "http://service.ws.sample/", 
			className = "")
	
	public String sayHello(@WebParam (name= "myName", targetNamespace= "") String myName);
}
