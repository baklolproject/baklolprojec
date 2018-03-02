package com.tableManagment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="r_ip_master")
public class RestroIPMasterModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" ,unique=true,nullable=false) 
	private long id;
	
	@Id
	@Column(name="IP_ADDRESS" ,unique=true,nullable=false) 
	private String ip_Address;
	@Column(name="R_NAME")
	private String RestroName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIp_Address() {
		return ip_Address;
	}
	public void setIp_Address(String ip_Address) {
		this.ip_Address = ip_Address;
	}
	public String getRestroName() {
		return RestroName;
	}
	public void setRestroName(String restroName) {
		RestroName = restroName;
	}

	}


