package com.sanjay.employeemanagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="software_id")
	private int software_id;
	
	@Column(name="software_name")
	private String softwareName;
	
	@Column(name="software_technology")
	private String softwareTech;
	
	@Column(name="software_service")
	private String softwareService;
	
	
	@Column(name="software_language")
	private String SoftwareLang;


	

    
	public int getSoftware_id() {
		return software_id;
	}



	public void setSoftware_id(int software_id) {
		this.software_id = software_id;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getSoftwareTech() {
		return softwareTech;
	}

	public void setSoftwareTech(String softwareTech) {
		this.softwareTech = softwareTech;
	}

	public String getSoftwareService() {
		return softwareService;
	}

	public void setSoftwareService(String softwareService) {
		this.softwareService = softwareService;
	}

	public String getSoftwareLang() {
		return SoftwareLang;
	}

	public void setSoftwareLang(String softwareLang) {
		SoftwareLang = softwareLang;
	}





	public Employee(int software_id, String softwareName, String softwareTech, String softwareService,
			String softwareLang) {
		super();
		this.software_id = software_id;
		this.softwareName = softwareName;
		this.softwareTech = softwareTech;
		this.softwareService = softwareService;
		SoftwareLang = softwareLang;
	}



	public Employee() {
	}
	}
	
	











