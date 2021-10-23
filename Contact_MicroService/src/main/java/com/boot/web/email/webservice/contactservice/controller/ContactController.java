package com.boot.web.email.webservice.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.web.email.webservice.contactservice.entity.TblContact;
import com.boot.web.email.webservice.contactservice.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/user/{id}")
	public List<TblContact> get(@PathVariable("id") int id) {
       return contactService.getContact(id);

	}
}
