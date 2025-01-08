package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookDatabase")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialNo;
	private String bookName;
	@Column(name = "AuthorName")
	private String bookAuthor;
	private double bookPrice;

	public Book() {

	}

	public Book(int serialNo, String bookName, String bookAuthor, double bookPrice) {
		super();
		this.serialNo = serialNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [serialNo=" + serialNo + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + "]";
	}

}
