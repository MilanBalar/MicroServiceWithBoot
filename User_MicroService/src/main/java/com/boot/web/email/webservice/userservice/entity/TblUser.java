package com.boot.web.email.webservice.userservice.entity;

import java.util.List;

public class TblUser {

	private int userId;
	private String name;
	private int phone;

	private List<TblContact> tblcontact;



	public TblUser(int userId, String name, int phone, List<TblContact> tblcontact) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.tblcontact = tblcontact;
	}

	public TblUser(int userId, String name, int phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<TblContact> getTblcontact() {
		return tblcontact;
	}

	public void setTblcontact(List<TblContact> tblcontact) {
		this.tblcontact = tblcontact;
	}





}
