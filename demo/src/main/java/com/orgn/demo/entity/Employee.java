package com.orgn.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity  
@Table(name="employee")
public class Employee {
	@Column(name="id")
	@Id   
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="Email")
	private String Email;
	@Column(name="Org")
	private String Org;


	public Employee() {
		super();
		
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
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getOrg() {
		return Org;
	}
	public void setOrg(String org) {
		Org = org;
	}


	
}
