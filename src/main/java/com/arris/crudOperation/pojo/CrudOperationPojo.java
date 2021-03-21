package com.arris.crudOperation.pojo;

import org.springframework.stereotype.Component;

@Component
public class CrudOperationPojo {
	
	
	private int id;
	private String name;
	private String company;
	
	public CrudOperationPojo() {
		super();
	}

	public CrudOperationPojo(int id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "CrudOperationPojo [id=" + id + ", name=" + name + ", company=" + company + "]";
	}
	
	
	

}
