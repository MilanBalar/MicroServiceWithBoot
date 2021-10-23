package com.boot.web.email.webservice.contactservice.entity;

public class TblContact {


	private long cId;
	private String address;
	private long userId;

	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public TblContact(int cId, String address, int userId) {
		super();
		this.cId = cId;
		this.address = address;
		this.userId = userId;
	}





}
