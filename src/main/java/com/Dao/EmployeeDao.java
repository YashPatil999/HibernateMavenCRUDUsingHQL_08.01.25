package com.Dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Employee;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeDao {

	public void InsertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "insert into Employee (empName,empAge,empSalary) values(:name,:age,:salary)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "Yash Patil");
		query.setParameter("age", 25);
		query.setParameter("salary", 150000);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Added Successfully!!!");
	}

	public void UpdateData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "update Employee set empName =:name, empAge =:age, empSalary =: salary where empId =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "Girish");
		query.setParameter("age", 35);
		query.setParameter("salary", 70000);
		query.setParameter("id", 1);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Updated Successfully!!!!");
	}

	public void DeleteData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete Employee where empId =: id";
		Query<Employee> query = ss.createQuery(hqlQuery);		
		query.setParameter("id", 2);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Deleted Successfully!!!!");

	}

	public void GetSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Employee where empId =: id";
		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		query.setParameter("id", 1);
		Employee e1 = query.getSingleResult();
		System.out.println(e1);
		tr.commit();
		ss.close();

	}

	public void GetAllRecords() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Employee";
		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		List<Employee> list = query.getResultList();

		Iterator<Employee> iterator = list.iterator();

		while (iterator.hasNext()) {
			Employee item = iterator.next();
			System.out.println(item);
		}

	}
}
