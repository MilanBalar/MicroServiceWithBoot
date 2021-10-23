package com.boot.web.email.webservice.contactservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.boot.web.email.webservice.contactservice.entity.TblContact;

@Service
public class ContactServiceImpl implements ContactService {

	@Override
	public List<TblContact> getContact(long userId) {

		return this.getContact_data().stream().filter((c -> c.getUserId()==userId)).collect(Collectors.toList());
	}

	public List<TblContact> getContact_data()
	{
		 List<TblContact> list = new ArrayList<>();
		 list.add(new TblContact(1, "Surat", 1));
		 list.add(new TblContact(2, "AHMD", 1));
		 list.add(new TblContact(3, "rajkot", 2));

		return list;
	}







}
