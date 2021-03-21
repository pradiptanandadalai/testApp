package com.arris.crudOperation.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.arris.crudOperation.pojo.CrudOperationPojo;

@Component
public interface CrudOperationDao {
	
	public List<CrudOperationPojo>  getUserDetails(int userId);

}
