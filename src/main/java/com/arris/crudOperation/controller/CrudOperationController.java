package com.arris.crudOperation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arris.crudOperation.daoimpl.CrudOperationDaoImpl;
import com.arris.crudOperation.pojo.CrudOperationPojo;
import com.sun.el.parser.ParseException;

@RestController
public class CrudOperationController {

	@Autowired
	CrudOperationDaoImpl crudOperationDao;

	@RequestMapping(value = "/getUserData/{id}", method = RequestMethod.GET)
	public List<CrudOperationPojo> getMethod(@PathVariable int id) throws ParseException {
		List<CrudOperationPojo> list = new ArrayList();
		System.out.println("inside the controller::::::::::::::::::");
		System.out.println("your id is:" + id);
		list = crudOperationDao.getUserDetails(id);
		return list;

	}

}
