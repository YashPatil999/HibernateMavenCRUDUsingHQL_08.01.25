package com.controller;

import com.services.StudentService;

public class StudentController {

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
		StudentService ser = new StudentService();
		/*
		 * ser.InsertData(); ser.UpdateData(); ser.DeleteData(); ser.GetSingleRecord();
		 */
		ser.GetAllRecords();

	}
}
