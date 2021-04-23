package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.Contact;

public interface ContactService {
	
	Contact saveContact(Contact friend);
	Contact findContact(Long id);
	List<Contact> findAllContacts();
	String deleteContact(Long id);
}
