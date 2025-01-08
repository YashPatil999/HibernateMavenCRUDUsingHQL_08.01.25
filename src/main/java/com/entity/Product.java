package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProductDatabase")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	@Column(name = "ProductName")
	private String pName;
	@Column(name = "ProductQauntity")
	private int pQty;
	@Column(name = "ProductCost")
	private double pCost;

	public Product() {

	}

	public Product(int pId, String pName, int pQty, double pCost) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pQty = pQty;
		this.pCost = pCost;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpQty() {
		return pQty;
	}

	public void setpQty(int pQty) {
		this.pQty = pQty;
	}

	public double getpCost() {
		return pCost;
	}

	public void setpCost(double pCost) {
		this.pCost = pCost;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pQty=" + pQty + ", pCost=" + pCost + "]";
	}

}
