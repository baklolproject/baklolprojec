package com.tableManagment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="r_ip_master")
public class RestroIPMasterModel {
	

	@EmbeddedId
	private RestoIdentityModel restoIdentityModel;
	@Column(name="R_NAME")
	private String RestroName;
	
	public RestoIdentityModel getRestoIdentityModel() {
		return restoIdentityModel;
	}
	public void setRestoIdentityModel(RestoIdentityModel restoIdentityModel) {
		this.restoIdentityModel = restoIdentityModel;
	}
	public String getRestroName() {
		return RestroName;
	}
	public void setRestroName(String restroName) {
		RestroName = restroName;
	}

	}


