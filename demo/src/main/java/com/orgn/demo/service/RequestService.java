package com.orgn.demo.service;

import com.orgn.demo.entity.Employee;
import com.orgn.demo.reaponse.Response;
import com.orgn.demo.request.Request;

public interface RequestService {
	Response getDetails(Request request);

	Employee getDetailsById(int id);
	
	String deleteDetails(int id);
	
	String updateDetailsById(int id,Request request);
}
