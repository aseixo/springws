package sample.ws.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(serviceName = "HelloService", portName = "HelloPort", targetNamespace = "http://service.ws.sample/", endpointInterface = "sample.ws.service.Hello")

public class HelloPortImpl implements Hello {

	private static Logger logger = LoggerFactory.getLogger(HelloPortImpl.class);

	public String sayHello(String myName) {
		logger.info("Executing operation sayHello() " + myName);

		try {
			return "Hello, welcome to CXF Spring Boot , " + myName;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

}
