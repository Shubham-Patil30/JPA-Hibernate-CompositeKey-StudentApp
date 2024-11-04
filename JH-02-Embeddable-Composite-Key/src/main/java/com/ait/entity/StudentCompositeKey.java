package com.ait.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey  implements Serializable{
	@Column(name="ROLLNO")
	private Integer rollNo ; 
	
	private String section ;

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", section=" + section ;
	}

	
}
