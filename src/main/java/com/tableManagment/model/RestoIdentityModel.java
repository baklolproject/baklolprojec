package com.tableManagment.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Embeddable
public class RestoIdentityModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name="ID")
	private long id;
	
	
	@NotNull
	@Column(name="IP_ADDRESS")
	private String ip_Address;
	
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

	public RestoIdentityModel() {
		
	}
	public RestoIdentityModel(long id, String ip_Address) {
		super();
		this.id = id;
		this.ip_Address = ip_Address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((ip_Address == null) ? 0 : ip_Address.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestoIdentityModel other = (RestoIdentityModel) obj;
		if (id != other.id)
			return false;
		if (ip_Address == null) {
			if (other.ip_Address != null)
				return false;
		} else if (!ip_Address.equals(other.ip_Address))
			return false;
		return true;
	}
}
