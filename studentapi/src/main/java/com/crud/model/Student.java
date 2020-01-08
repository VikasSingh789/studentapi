package com.crud.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


public class Student implements Serializable{

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
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", address=" + address + "]";
	}
	@Override
	public int hashCode(){
	    return new HashCodeBuilder()
	        .append(sid)
	       
	        .toHashCode();
	}

	@Override
	public boolean equals(final Object obj){
	    if(obj instanceof Student){
	        final Student other = (Student) obj;
	        return new EqualsBuilder()
	            .append(sid, other.sid)
	            .isEquals();
	    } else{
	        return false;
	    }
	}
	
}
