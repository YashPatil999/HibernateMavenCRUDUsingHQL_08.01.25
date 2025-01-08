package com.controller;

import com.services.EmployeeService;

public class EmployeeController {

	/*
	 * public void InsertData() { ser.InsertData(); }
	 * 
	 * public void UpdateData() { ser.UpdateData(); }
	 * 
	 * public void DeleteData() { ser.DeleteData(); }
	 * 
	 * public void GetSingleRecord() { ser.GetSingleRecord(); }
	 * 
	 * public void GetAllRecords() { ser.GetAllRecords(); }
	 */

	public static void main(String[] args) {
		EmployeeService ser = new EmployeeService();

		ser.InsertData();
		/*
		 * ser.UpdateData(); ser.DeleteData(); ser.GetSingleRecord();
		 * 
		 * ser.GetAllRecords();
		 */

	}
}
