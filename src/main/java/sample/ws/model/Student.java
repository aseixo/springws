package sample.ws.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import sample.ws.adapter.StudentAdapter;


@Entity
@Table(name = "estudantes")

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1368400575390981743L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "estudante_id")

	private long id;
	@Column(name = "nome")

	private String name;
	@Column(name = "dni")

	private String idCard;
	@Column(name = "dataNac")

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	public Student() {

	}

	public Student(long id, String name, String idCard, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.idCard = idCard;
		this.birthDate = birthDate;
	}

	//@XmlElement(name = "id", required = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	//@XmlElement(name = "idCard")
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	//@XmlElement(name = "birthDate")
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	//@XmlElement(name = "name")
	//@XmlJavaTypeAdapter(StudentAdapter.class)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (id != other.id)
			return false;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", idCard=" + idCard + ", birthDate=" + birthDate + "]";
	}

}
