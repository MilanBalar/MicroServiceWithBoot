package com.boot.web.email.webservice.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.boot.web.email.webservice.userservice.entity.TblUser;
import com.boot.web.email.webservice.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

   @Autowired
   private UserService userService;
   @Autowired
   private RestTemplate restTemplate;

    @GetMapping("/{id}")
	public TblUser get(@PathVariable("id") int id) {

    	TblUser tblUser = userService.getUserbyid(id);

		/*------------------communitation of microservice strat------------------------*/
    	//1st param is URL
    	//2nd param is type of data
    	List contacts = restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+tblUser.getUserId(), List.class);
    	tblUser.setTblcontact(contacts);

    	/*------------------communitation of microservice end------------------------*/
    	return tblUser;

	}

}
