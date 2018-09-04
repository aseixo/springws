package sample.ws.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class StudentAdapter extends XmlAdapter<String, String> {

	@Override
	public String unmarshal(String v) throws Exception {
		
		return v;
	}

	@Override
	public String marshal(String v) throws Exception {
		
		return v.toUpperCase();
	}

	

	
}
