package com.controller;

import com.services.VehicleService;

public class VehicleController {

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
		VehicleService ser = new VehicleService();
		/*
		 * ser.InsertData(); ser.UpdateData(); ser.DeleteData(); ser.GetSingleRecord();
		 */
		ser.GetAllRecords();

	}
}
