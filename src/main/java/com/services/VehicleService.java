package com.services;

import com.Dao.VehicleDao;

public class VehicleService {

	VehicleDao dao = new VehicleDao();

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
