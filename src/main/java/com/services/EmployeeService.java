package com.services;

import com.Dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao dao = new EmployeeDao();

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
