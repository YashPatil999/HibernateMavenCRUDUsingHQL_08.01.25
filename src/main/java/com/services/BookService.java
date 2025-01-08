package com.services;

import com.Dao.BookDao;

public class BookService {

	BookDao dao = new BookDao();

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
