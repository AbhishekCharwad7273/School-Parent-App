package com.SchoolParentService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.SchoolParentService.Entity.Staff;
import com.SchoolParentService.Services.StaffService;

@RestController
public class StaffController {

	
	@Autowired
	private StaffService staffService;
	
	@PostMapping("/createCircular")
	public Staff createCircular(@RequestBody Staff staff)
	{
		
		return staffService.createCircular(staff);
		
	}
	
	@GetMapping("/getAllCircular")
	public List<Staff>getAllCircular()
	{
		return staffService.getAllCircular();
	}
	
	
}
