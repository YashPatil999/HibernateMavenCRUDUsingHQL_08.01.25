package com.controller;

import com.services.BookService;

public class BookController {

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
		BookService ser = new BookService();

		ser.InsertData();
		/*
		 * ser.UpdateData(); ser.DeleteData(); ser.GetSingleRecord();
		 * 
		 * ser.GetAllRecords();
		 */

	}
}
