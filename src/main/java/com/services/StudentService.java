package com.services;

import com.Dao.StudentDao;

public class StudentService {

	StudentDao dao = new StudentDao();

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
