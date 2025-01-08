package com.Dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Product;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class ProductDao {

	public void InsertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "insert into Product (pName,pQty,pCost) values(:name,:qty,:cost)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "Iphone 16 Pro");
		query.setParameter("qty", 5);
		query.setParameter("cost", 60000);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Added Successfully!!!");
	}

	public void UpdateData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "update Product set pName =:name, pQty =:qty, pCost =: cost where pId =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "Iphone 16");
		query.setParameter("qty", 2);
		query.setParameter("cost", 70000);
		query.setParameter("id", 1);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Updated Successfully!!!");
	}

	public void DeleteData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete Employee where empId =: empid";
		Query<Product> query = ss.createQuery(hqlQuery);		
		query.setParameter("empid", 2);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Deleted Successfully!!!");
	}

	public void GetSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Product where pId =: id";
		Query<Product> query = ss.createQuery(hqlQuery, Product.class);
		query.setParameter("id", 2);
		Product p1 = query.getSingleResult();
		System.out.println(p1);
		tr.commit();
		ss.close();

	}

	public void GetAllRecords() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Product";
		Query<Product> query = ss.createQuery(hqlQuery, Product.class);
		List<Product> list = query.getResultList();

		Iterator<Product> iterator = list.iterator();

		while (iterator.hasNext()) {
			Product item = iterator.next();
			System.out.println(item);
		}

	}
}
