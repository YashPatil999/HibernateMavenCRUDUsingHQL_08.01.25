package com.Dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Vehicle;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class VehicleDao {

	public void InsertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "insert into Vehicle (CarNumber,CarMake,CarModel,CarManufacturingYear) values(:number,:make,:model,:year)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("number", "YU 68 GY 8485");
		query.setParameter("make", "Kia");
		query.setParameter("model", "Seltos");
		query.setParameter("year", 2021);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Added Successfully!!!");
	}

	public void UpdateData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "update Vehicle set CarNumber =:number, CarMake =:make, CarModel =: model, CarManufacturingYear =: year where SrNumber =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("number", "GJ 04 HG 7965");
		query.setParameter("make", "Suzuki");
		query.setParameter("model", "Alto k10");
		query.setParameter("year", 2015);
		query.setParameter("id", 1);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Updated Successfully!!!");
	}

	public void DeleteData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete Vehicle where SrNumber =: id";
		Query<Vehicle> query = ss.createQuery(hqlQuery);		
		query.setParameter("id", 1);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Deleted Successfully!!!");
	}

	public void GetSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Vehicle where SrNumber =: id";
		Query<Vehicle> query = ss.createQuery(hqlQuery, Vehicle.class);
		query.setParameter("id", 2);
		Vehicle v1 = query.getSingleResult();
		System.out.println(v1);
		tr.commit();
		ss.close();

	}

	public void GetAllRecords() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Vehicle";
		Query<Vehicle> query = ss.createQuery(hqlQuery, Vehicle.class);
		List<Vehicle> list = query.getResultList();

		Iterator<Vehicle> iterator = list.iterator();

		while (iterator.hasNext()) {
			Vehicle item = iterator.next();
			System.out.println(item);
		}
	}
}
