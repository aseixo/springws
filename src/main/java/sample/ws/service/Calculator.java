package sample.ws.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace= "http://service.ws.sample", name = "Calculator")
public interface Calculator {
	
	public double hipotenuse(@WebParam (name= "x", targetNamespace= "") double x, @WebParam (name= "y", targetNamespace= "")double y);
	public double surface(@WebParam (name= "x", targetNamespace= "") double x, @WebParam (name= "y", targetNamespace= "")double y);
	public double perimeter(@WebParam (name= "x", targetNamespace= "") double x, @WebParam (name= "y", targetNamespace= "")double y);

}
