package model.entities;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private String email;
	
	public Person() {
	}

	public Person(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
}
