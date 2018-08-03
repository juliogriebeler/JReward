package br.com.juliogriebeler.jreward.model;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private String id;
	private String fisrtName;
	private String lastName;
	private String login;
	private String email;
	private String phone;
	private String document;
	private String password;
	private String passwordHintQuestion;
	private String passwordHintAnswer;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordHintQuestion() {
		return passwordHintQuestion;
	}
	public void setPasswordHintQuestion(String passwordHintQuestion) {
		this.passwordHintQuestion = passwordHintQuestion;
	}
	public String getPasswordHintAnswer() {
		return passwordHintAnswer;
	}
	public void setPasswordHintAnswer(String passwordHintAnswer) {
		this.passwordHintAnswer = passwordHintAnswer;
	}
	
}
