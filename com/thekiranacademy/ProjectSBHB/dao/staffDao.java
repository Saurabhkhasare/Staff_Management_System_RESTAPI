package com.thekiranacademy.ProjectSBHB.dao;

import java.util.List;





import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.thekiranacademy.ProjectSBHB.Entity.staff;


@Repository
public class staffDao {

	@Autowired
	SessionFactory sf;
	
	
	 
	
	public List<staff> getAllstaff() {
		
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(staff.class);
		List<staff> ss = criteria.list();
		session.close();
		return ss;
	}



	public staff getstaffBystaffID(int staffid) {
		Session session = sf.openSession();
		staff s1 = session.get(staff.class ,staffid);
		session.close();
		return s1;
	}

	public boolean insertstaff(staff ss1) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		System.out.println(ss1);
		session.save(ss1);
		tr.commit();
		session.close();
		return true;
	}



	public void getstaffsalary(double salary) {
		Session session = sf.openSession();
		staff s1 = session.get(staff.class ,salary);
		session.close();
		
	}



	public List<staff> getstaffsalary() {
	
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(staff.class);
		List<staff> ss = criteria.list();
		session.close();
	
		return ss;
	}


	public List<staff> getstaffexp1020() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(staff.class);
		criteria.add(Restrictions.between("experience", 10, 20));
		List<staff> l1 = criteria.list();
		session.close();
		return l1;
	}



	public List<staff> getmore20ksalary() {
	 
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(staff.class);
		criteria.add(Restrictions.gt("salary",20000.0 ));
		List<staff> ss = criteria.list();
		session.close();
		return ss;
		
	}



	public List<staff>  getmaxsalary() {
		
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(staff.class);
		criteria.addOrder(Order.desc("salary"));
		criteria.setMaxResults(1);
		List<staff> ss = criteria.list();
		return ss;
		
	}



	public List<staff> getstafftrainer() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(staff.class);
		criteria.add(Restrictions.ilike("profile", "trainer"));
		List<staff> s1 = criteria.list();
		session.close();
		return s1;
		
	}



	public List<staff> staffexcepttrainer() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(staff.class);
		criteria.add(Restrictions.ne("profile","trainer"));
		List<staff> s1 = criteria.list();
		session.close();
		return s1;
	}



	public String getstaffmimexp() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(staff.class);
		criteria.addOrder(Order.asc("experience"));
		criteria.setMaxResults(1);
		List<staff> s1 = criteria.list();
		String Str=null;
		for (staff staff : s1) {
			Str=staff.getName();
		}
		return Str;
		
	}


	
	
}
