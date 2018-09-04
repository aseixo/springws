package sample.ws.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.jws.WebService(serviceName="CalculatorService", portName = "CalculatorPort",
targetNamespace= "http://service.ws.sample/",
endpointInterface="sample.ws.service.Calculator")

public class CalculatorPortImpl implements Calculator{

	private static Logger logger = LoggerFactory.getLogger(CalculatorPortImpl.class);
	
	public double hipotenuse(double x, double y) {
		
		logger.info("CALCULATOR Service is obtaining hypotenuse");
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	
	public double surface(double x, double y) {
		
		logger.info("CALCULATOR Service is obtaining triangle area");
		return 0.5 * x * y;
	}

	
	public double perimeter(double x, double y) {
		
		logger.info("CALCULATOR Service is obtaining total perimeter");
		return this.hipotenuse(x, y) + x + y;
	}

}
