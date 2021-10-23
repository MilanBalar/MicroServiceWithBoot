package com.boot.web.email.webservice.userservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.web.email.webservice.userservice.entity.TblUser;

@Service
public class UserServieImpl implements UserService {


	public List<TblUser> getuser()
	{
		 List<TblUser> list = new ArrayList<>();
		 list.add(new TblUser(1, "ram", 66698989));
		 list.add(new TblUser(2, "jam", 99998989));
		 list.add(new TblUser(3, "kam", 77798989));

		return list;
	}





	@Override
	public TblUser getUserbyid(int id) {

	return this.getuser().stream().filter(user -> user.getUserId()==id).findAny().orElse(null);


	}

}
