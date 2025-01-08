package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VehicleDatabase")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SrNumber;
	@Column(name = "RegistrationNumber")
	private String carNumber;
	private String carMake;
	private String carModel;
	private int carManufacturingYear;

	public Vehicle() {

	}

	public Vehicle(int srNumber, String carNumber, String carMake, String carModel, int carManufacturingYear) {
		super();
		SrNumber = srNumber;
		this.carNumber = carNumber;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carManufacturingYear = carManufacturingYear;
	}

	public int getSrNumber() {
		return SrNumber;
	}

	public void setSrNumber(int srNumber) {
		SrNumber = srNumber;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarManufacturingYear() {
		return carManufacturingYear;
	}

	public void setCarManufacturingYear(int carManufacturingYear) {
		this.carManufacturingYear = carManufacturingYear;
	}

	@Override
	public String toString() {
		return "Vehicle [SrNumber=" + SrNumber + ", carNumber=" + carNumber + ", carMake=" + carMake + ", carModel="
				+ carModel + ", carManufacturingYear=" + carManufacturingYear + "]";
	}

}
