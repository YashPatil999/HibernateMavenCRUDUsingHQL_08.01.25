package com.Dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.MutationQuery;

import com.entity.Book;

public class BookDao {

	public void InsertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Book (bookName,bookAuthor,bookPrice) values(:name,:author,:price)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "Middle of the Night");
		query.setParameter("author", "Riley Sager");
		query.setParameter("price", 900);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Added Successfully!!!");
	}

	public void UpdateData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "update Book set bookName =:name, bookAuthor =:author, bookPrice =: price where serialNo =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", "GameOfThrones");
		query.setParameter("author", "Riche Rich");
		query.setParameter("price", 650);
		query.setParameter("id", 1);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Updated Successfully!!!");
	}

	public void DeleteData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete Book where serialNo =: id";
		Query<Book> query = ss.createQuery(hqlQuery);		
		query.setParameter("id", 2);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Deleted Successfully!!!");
	}

	public void GetSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Book where serialNo =: id";
		Query<Book> query = ss.createQuery(hqlQuery, Book.class);
		query.setParameter("id", 1);
		Book b1 = query.getSingleResult();
		System.out.println(b1);
	}

	public void GetAllRecords() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Book";
		Query<Book> query = ss.createQuery(hqlQuery, Book.class);
		List<Book> list = query.getResultList();

		Iterator<Book> iterator = list.iterator();

		while (iterator.hasNext()) {
			Book item = iterator.next();
			System.out.println(item);
		}
	}
}
