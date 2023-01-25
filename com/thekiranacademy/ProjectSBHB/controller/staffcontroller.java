package com.thekiranacademy.ProjectSBHB.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.thekiranacademy.ProjectSBHB.Entity.staff;
import com.thekiranacademy.ProjectSBHB.service.staffService;

@RestController
public class staffcontroller {

	@Autowired
	staffService ss ;
	
	
	@GetMapping("/all")
	public List<staff> getAllstaff()
	{
		List<staff> s = ss.getAllstaff();
		return s;
	}
	

	@GetMapping("staff/{staffid}")
	staff getstaffBystaffID(@PathVariable int staffid)
	{
		staff s1 = ss.getstaffBystaffID(staffid);
		return s1;
		
	}
	
	
	@PostMapping("/add")
	public boolean insertstaff(@RequestBody staff ss1)
	{
		boolean inserted = ss.insertstaff(ss1);
		return inserted;
	}
	
	@GetMapping("/more20ksalary")
	public List<staff> getmore20ksalary()
	{
		List<staff> s1 = ss.getmore20ksalary();
		return s1;
	}

	@GetMapping("/Experience10-20")
	public List<staff> getstaffexp1020()
	{
		List<staff> l1 = ss.getstaffexp1020();
		return l1;

	}
	
	@GetMapping("/maxsalary")
	public List<staff> getmaxsalary()
	{
		List<staff> s1  = ss.getmaxsalary();
		return s1;
	}

	@GetMapping("/getstafftrainer")
	public List<staff> getstafftrainer()
	{
		List<staff> s1 = ss.getstafftrainer();
		return s1;
	}
	
	@GetMapping("/exceptrainer")
	public List<staff> staffexcepttrainer()
	{
		List<staff> s1 = ss.staffexcepttrainer();
		return s1;
	}
	
	@GetMapping("/getminiexp")
	public String getstaffmimexp()
	 {
		 return ss.getstaffmimexp();
		 
	 }
}
