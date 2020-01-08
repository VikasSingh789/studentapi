package com.crud.dto;

public class StudentDTO {
	
	private Long sid;
	private String sname;
	private String email;
	private String address;
	
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "StudentDTO [sid=" + sid + ", sname=" + sname + ", email=" + email + ", address=" + address + "]";
	}
	
}
