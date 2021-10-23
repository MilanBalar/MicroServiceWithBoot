package com.boot.web.email.webservice.contactservice.service;

import java.util.List;

import com.boot.web.email.webservice.contactservice.entity.TblContact;

public interface ContactService {

  public List<TblContact> getContact(long id);
}
