package com.cts.capstone.vnfhome.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vnf_location")
public class VnfLocations {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@Column(name="location")
	String locationName;
	@Column(name="client")
	String client;
	
	public VnfLocations() {
		super();
	}

	public VnfLocations(Integer id, String locationName, String client) {
		super();
		this.id = id;
		this.locationName = locationName;
		this.client = client;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}

}
