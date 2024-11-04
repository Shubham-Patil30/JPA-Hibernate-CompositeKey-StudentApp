package com.ait.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="student_tbl")
public class StudentEntity {
	@EmbeddedId
	private StudentCompositeKey compositeKey ; 
	
	@Column(name = "SNAME")
	private String studentName ;
	
	@Column(name = "MARKS")
	private Double marks ;

	public StudentCompositeKey getCompositeKey() {
		return compositeKey;
	}

	public void setCompositeKey(StudentCompositeKey compositeKey) {
		this.compositeKey = compositeKey;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return   compositeKey + ", studentName=" + studentName + ", marks=" + marks;
	} 
	
	
}
