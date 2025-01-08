package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentDatabase")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	private String sName;
	private int sAge;
	@Column(name = "TotalMarks")
	private int sMarks;

	public Student() {
	}

	public Student(int sId, String sName, int sAge, int sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sMarks = sMarks;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public int getsMarks() {
		return sMarks;
	}

	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sMarks=" + sMarks + "]";
	}

}
