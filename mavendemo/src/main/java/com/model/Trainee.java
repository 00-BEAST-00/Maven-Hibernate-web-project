package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Trainee_Details")
public class Trainee {
@Id
@Column(name ="EMP_Id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name ="EMP_NAME")
private String name;
@Column(name ="EMP_EMAILID")
private String email;
@Column(name ="EMP_DOB")
private String dob;
@Column(name ="EMP_PHONE")
private String phone;
public Trainee(){
	super();
}

public Trainee(int id, String name, String email, String dob, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.dob = dob;
	this.phone = phone;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

}