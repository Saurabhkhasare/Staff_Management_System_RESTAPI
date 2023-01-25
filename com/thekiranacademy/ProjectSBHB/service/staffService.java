package com.thekiranacademy.ProjectSBHB.service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thekiranacademy.ProjectSBHB.Entity.staff;
import com.thekiranacademy.ProjectSBHB.dao.staffDao;

@Service
public class staffService {

	@Autowired
	staffDao dao;
	
	
	public List<staff> getAllstaff() {
		
		List<staff> ss = dao.getAllstaff();
		return ss;	
	}

	public staff getstaffBystaffID(int staffid) {
		
		   return dao.getstaffBystaffID(staffid);
	}
	
	

	public boolean insertstaff(staff ss1) {

    return dao.insertstaff(ss1);
		
	}
     
	


	public List<staff> getstaffexp1020() {
		List<staff> l1 = dao.getstaffexp1020();
		return l1;
	}

	public List<staff> getmore20ksalary() {
		List<staff> ss = dao.getmore20ksalary();
		return ss;
		
		
	}

	public List<staff>  getmaxsalary() {
		List<staff> ss = dao.getmaxsalary();
		return ss;
		
	}

	public List<staff> getstafftrainer() {
		List<staff> s1 = dao.getstafftrainer();
		return s1;
		
	}

	public List<staff> staffexcepttrainer() {
		List<staff> s1 = dao.staffexcepttrainer();
		return s1;
		
		
	}

	public String getstaffmimexp() {
		return dao.getstaffmimexp();
		 
		
	}
	

	




	
	

	


	

}
