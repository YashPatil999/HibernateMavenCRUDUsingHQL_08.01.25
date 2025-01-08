package com.Dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Student;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class StudentDao {

	public void InsertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "insert into Student (sName,sAge,sMarks) values(:name,:age,:marks)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "Umesh");
		query.setParameter("age", 15);
		query.setParameter("marks", 208);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Added Successfully!!!");

	}

	public void UpdateData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int stuid = 1;
		Student s1 = ss.get(Student.class, stuid);
		s1.setsName("Manish");
		s1.setsAge(22);
		s1.setsMarks(450);
		ss.merge(s1);
		
		String hqlQuery = "update Student set sName =:name, sAge =:age, sMarks =: marks where sId =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "Yash Patil");
		query.setParameter("age", 25);
		query.setParameter("marks", 400);
		query.setParameter("id", 1);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Updated Successfully!!!");

	}

	public void DeleteData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete Student where sId =: id";
		Query<Student> query = ss.createQuery(hqlQuery);		
		query.setParameter("id", 1);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Deleted Successfully!!!");

	}

	public void GetSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Student where sId =: id";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		query.setParameter("id", 2);
		Student s1 = query.getSingleResult();
		System.out.println(s1);
		tr.commit();
		ss.close();

	}

	public void GetAllRecords() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Student";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		List<Student> list = query.getResultList();

		Iterator<Student> iterator = list.iterator();

		while (iterator.hasNext()) {
			Student item = iterator.next();
			System.out.println(item);
		}
	}
}
