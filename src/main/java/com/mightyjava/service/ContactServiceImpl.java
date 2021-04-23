package com.mightyjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightyjava.entity.Contact;
import com.mightyjava.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	private ContactRepository contactRepository;

	@Autowired
	public ContactServiceImpl(ContactRepository userRepository) {
		this.contactRepository = userRepository;
	}

	@Override
	public List<Contact> findAllContacts() {
		return contactRepository.findAll();
	}

	@Override
	public Contact findContactById(Long id) {
		return contactRepository.findById(id).get();
	}

	@Override
	public Contact saveContact(Contact contact) {
		// Contact f = contactRepository.save(contact); //ok
		Contact f = contactRepository.saveAndFlush(contact);
		System.out.println(f);
		return f;
	}

	@Override
	public String deleteContactById(Long id) {
		contactRepository.deleteById(id);
		return "{'message':'Contact deleted successfully.'}";
	}
}
