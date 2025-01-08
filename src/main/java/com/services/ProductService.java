package com.services;

import com.Dao.ProductDao;

public class ProductService {

	ProductDao dao = new ProductDao();

	public void InsertData() {
		dao.InsertData();
	}

	public void UpdateData() {
		dao.UpdateData();
	}

	public void DeleteData() {
		dao.DeleteData();
	}

	public void GetSingleRecord() {
		dao.GetSingleRecord();
	}

	public void GetAllRecords() {
		dao.GetAllRecords();
	}
}
