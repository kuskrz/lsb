package kus.krzysztof.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	private Long sex_id;

	@ManyToMany
	@JoinTable(name = "PERSON_TO_PERSON",
		joinColumns=@JoinColumn(name="PERSON_ID1", referencedColumnName="ID"),
        inverseJoinColumns=@JoinColumn(name="PERSON_ID2", referencedColumnName="ID"))
	private Set<Person> partner;

	@OneToOne
	@JoinColumn(name = "sex_id", referencedColumnName = "ID")
	private Sex sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Person> getPartner() {
		return partner;
	}

	public void setPartner(Set<Person> partner) {
		this.partner = partner;
	}

	public Long getId() {
		return id;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

}
