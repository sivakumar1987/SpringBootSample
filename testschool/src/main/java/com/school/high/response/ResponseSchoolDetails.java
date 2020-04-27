package com.school.high.response;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResponseSchoolDetails {
	
	@Id
	private int schoolId;
	private String schoolName;
	private String schoolArea;
	private int schoolZip;
	
	
	
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolArea() {
		return schoolArea;
	}
	public void setSchoolArea(String schoolArea) {
		this.schoolArea = schoolArea;
	}
	public int getSchoolZip() {
		return schoolZip;
	}
	public void setSchoolZip(int schoolZip) {
		this.schoolZip = schoolZip;
	}
	
	

}
