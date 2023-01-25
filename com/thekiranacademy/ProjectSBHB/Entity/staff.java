package com.thekiranacademy.ProjectSBHB.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class staff {

	@Id
	private int staffid;
	private String name;
	private String profile;
	private double salary;
	private int experience;
	
	
	
	@Column
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "staff [staffid=" + staffid + ", name=" + name + ", profile=" + profile + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}
	
	
}
