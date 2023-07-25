package com.orgn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orgn.demo.entity.Employee;
import com.orgn.demo.reaponse.Response;
import com.orgn.demo.request.Request;
import com.orgn.demo.serviceimpl.RequestServiceimpl;

@RestController
public class HomeController {

	@Autowired
	RequestServiceimpl requestServiceimpl;

	@GetMapping("/hi")
	public String hi() {
		return "Hi Ashish";

	}

	@PostMapping("/request")

	public ResponseEntity<Response> hello(@RequestBody Request request) {
		Response details = requestServiceimpl.getDetails(request);

		return ResponseEntity.ok(details);
	}

	@GetMapping("/getdetails/{id}")

	public ResponseEntity<Employee> getData(@PathVariable(name = "id") int id) {

		Employee employee = requestServiceimpl.getDetailsById(id);
		return ResponseEntity.ok(employee);
	}

	@DeleteMapping("/deleteRecord/{id}")

	public ResponseEntity<String> deleteById(@PathVariable int id) {

		String  response = requestServiceimpl.deleteDetails(id);
		return ResponseEntity.ok(response);
	}
	@PutMapping("/updateDetails/{id}")

	public ResponseEntity<String> updateById(@PathVariable int id,@RequestBody Request request) {

		String  response = requestServiceimpl.updateDetailsById(id, request);
		return ResponseEntity.ok(response);
	}
}
