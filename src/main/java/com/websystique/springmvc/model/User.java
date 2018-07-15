package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User {

	private int id;
	
	private String name;
	
	private int age;
	
	private int domain;
	
	private int customer;
	
	private int person;
	
	private int login;

	public User(){
		id=0;
	}
	
	public User(int id, String name, int age, int domain, int customer, int person, int login){
		this.id = id;
		this.name = name;
		this.age = age;
		this.domain = domain;
		this.customer = customer;
		this.person = person;
		this.login = login;
	}

	//User user = new User(0,"Sarah",51,1);
	public User(int id, String name, int age, int login){
		this.id = id;
		this.name = name;
		this.age = age;
		this.login = login;
	}
	
	@XmlElement
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@XmlElement
	public int getDomain() {
		return domain;
	}

	public void setDomain(int domain) {
		this.domain = domain;
	}
	@XmlElement
	public int getCustomer() {
		return customer;
	}
	
	public void setCustomer(int customer) {
		this.customer = customer;
	}
	@XmlElement
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}
	@XmlElement
	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", domain=" + domain +",customer="+customer+", person="+person+", login="+login+ "]";
	}


}
