package com.SchoolParentService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolParentService.Entity.Parent;
import com.SchoolParentService.Services.ParentService;

@RestController
public class ParentController {
	
	@Autowired
	private ParentService parentService;
	
	
	@PostMapping("/addParentDetail")
	public Parent addParentDetail(@RequestBody Parent parent)
	{
		
		return parentService.saveParentDetail(parent);
	}
/*	
	@PostMapping("/addParentDetails")
	public List<Parent> addParentDetails(@RequestBody List<Parent> parent)
	{
		
		return parentService.saveParentDetails(parent);
	}
	*/
	@GetMapping("/getAllParentDetail")
	public List<Parent>getAllParentDetails()
	{
		return parentService.getParentDetails();
	}
	
	@PutMapping("/updateParentDetail")
	public Parent updateParentDetail(@RequestBody Parent parent)
	{
		
		return parentService.updateParentDetails(parent);
	}
}
