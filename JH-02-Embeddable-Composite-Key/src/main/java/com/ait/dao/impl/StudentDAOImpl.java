package com.ait.dao.impl;

import com.ait.dao.StudentDAO;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDAOImpl implements StudentDAO {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveStudent(StudentEntity student) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction(); 
		tx.begin();
		try {
			StudentEntity existingStudent = entityManager.find(StudentEntity.class, student.getCompositeKey());
			if( existingStudent != null) {
				System.out.println("Studnet Allready Added in database");
			}
			else {
				entityManager.persist(student);
				tx.commit();
				System.out.println("Student added successfully in db !");
			}
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("can not add the student some error occurs!! ");
		}
		finally {
			entityManager.close();
		}

	}

	@Override
	public StudentEntity showStudent(StudentCompositeKey compositeKey) {
		EntityManager entityManager = factory.createEntityManager();
		
		StudentEntity student = entityManager.find(StudentEntity.class, compositeKey);
		entityManager.close();
		return student;
		
	}

}
