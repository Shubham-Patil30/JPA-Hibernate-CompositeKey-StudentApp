package com.ait.test;

import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOImpl;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;

public class Test {

	public static void main(String[] args) {
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNo(101);
		compositeKey.setSection("B");
		
		StudentEntity student = new StudentEntity(); 
		student.setCompositeKey(compositeKey);
		student.setStudentName("Rahul");
		student.setMarks(75.88);
		
		StudentDAO dao = new StudentDAOImpl(); 
		dao.saveStudent(student);
		
		StudentEntity s1 =  dao.showStudent(compositeKey);
		System.out.println(s1);
	}

}
