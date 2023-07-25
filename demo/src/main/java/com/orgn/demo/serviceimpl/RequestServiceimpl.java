package com.orgn.demo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orgn.demo.entity.Employee;
import com.orgn.demo.query.EmployeeRepository;
import com.orgn.demo.reaponse.Response;
import com.orgn.demo.request.Request;
import com.orgn.demo.service.RequestService;

@Service
public class RequestServiceimpl implements RequestService{

	 @Autowired
	 EmployeeRepository employeeRepository;
	 
	@Override
	public Response getDetails(Request request) {
		Employee employee =new Employee();
		Response res=new Response();
		res.setId(request.getId());
		res.setName(request.getName());
		res.setEmail(request.getEmail());
		res.setOrg(request.getOrg());
		res.setSalary("10000");
		if(res.getName()!=null){
			employee.setId(request.getId());
			employee.setName(request.getName());
			employee.setEmail(request.getEmail());
			employee.setOrg(request.getOrg());
			employeeRepository.save(employee);
			
		}
		return res;
	}

	@Override
	public Employee getDetailsById(int id) {
		Optional<Employee> employee =employeeRepository.findById(id);
		
		return employee.get();
	}

	@Override
	public String deleteDetails(int id) {
		employeeRepository.deleteById(id);
	
		return "deletedSuccessfully";
	}

	@Override
	public String updateDetailsById(int id, Request request) {
		Optional<Employee> employee=employeeRepository.findById(id);
		if (employee.get()!=null) {
			Employee data = new Employee();
			data.setId(request.getId());
			data.setName(request.getName());
			data.setEmail(request.getEmail());
			data.setOrg(request.getOrg());
			employeeRepository.save(data);
		}
		
		return "UpdateRecordSuccesssfully";
	}

	
      
	
	
}
