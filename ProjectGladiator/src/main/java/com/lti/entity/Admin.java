package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@Column(name="admin_id")
	private int adminId;
	
	private String name;
	private String email;
	private String password;
	
	@OneToMany(mappedBy="admin")
	private List<Retailer> retailers;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Retailer> getRetailers() {
		return retailers;
	}
	public void setRetailers(List<Retailer> retailers) {
		this.retailers = retailers;
	}
	
	
}
