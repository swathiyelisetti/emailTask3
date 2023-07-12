package com.emailDemo.springemailclient.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;

@Entity
@Component
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "username",unique=true)
	private String username;

	@Column(name = "password",unique=true)
	private String password;

	@Column(name = "email",unique = true)
	private String email;
	
	@Column(name="verificationcode")
	private String verificationcode;
	
	@Column(name="verified")
	private boolean verified;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerificationcode() {
		return verificationcode;
	}

	public void setVerificationcode(String verificationcode) {
		this.verificationcode = verificationcode;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public User() {
		super();
	}

	public User(int id, String username, String password, String email, String verificationcode, boolean verified) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.verificationcode = verificationcode;
		this.verified = verified;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", verificationcode=" + verificationcode + ", verified=" + verified + "]";
	}

	
}
