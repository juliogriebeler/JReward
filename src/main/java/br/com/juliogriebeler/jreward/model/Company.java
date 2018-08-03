package br.com.juliogriebeler.jreward.model;

import org.springframework.data.annotation.Id;

public class Company {

	@Id
	private String id;
	private String name;
	private String description;
	private Address address;
	private User masterUser;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User getMasterUser() {
		return masterUser;
	}
	public void setMasterUser(User masterUser) {
		this.masterUser = masterUser;
	}

}
