package sample.ws;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.ws.service.CalculatorPortImpl;
import sample.ws.service.HelloPortImpl;
import sample.ws.service.StudentWSImpl;

@Configuration
public class WebServiceConfig {

	@Autowired
	private Bus bus;

	@Bean
	public Endpoint endpoint() {

		HelloPortImpl implementor = new HelloPortImpl();
		EndpointImpl endpoint = new EndpointImpl(bus, implementor);
		endpoint.publish("/Hello");
		return endpoint;
	}

	@Bean
	public Endpoint endpoint1() {

		CalculatorPortImpl implementor = new CalculatorPortImpl();
		EndpointImpl endpoint = new EndpointImpl(bus, implementor);
		endpoint.publish("/Calculator");
		return endpoint;
	}

	@Bean
	public Endpoint endpointStudent() {

		StudentWSImpl implementor = new StudentWSImpl();
		EndpointImpl endpoint = new EndpointImpl(bus, implementor);
		endpoint.publish("/Student");
		return endpoint;
	}

}
