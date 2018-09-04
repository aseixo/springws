package sample.ws.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import sample.ws.adapter.StudentAdapter;

@XmlRootElement(name="Student")
public class Student {

	private long id;
	private String name;
	private String email;
	private int year;

	public Student() {

	}

	public Student(long id, String name, String email, int year) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.year = year;
	}

	@XmlAttribute
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@XmlElement
	@XmlJavaTypeAdapter(StudentAdapter.class)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", year=" + year + "]";
	}

}
