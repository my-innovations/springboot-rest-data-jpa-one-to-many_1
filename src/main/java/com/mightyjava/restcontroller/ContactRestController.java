package com.mightyjava.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mightyjava.entity.Contact;
import com.mightyjava.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactRestController {

	private ContactService contactService;

	@Autowired //optional
	public ContactRestController(ContactService userService) {
		this.contactService = userService;
	}

	@RequestMapping("/save")
	public Contact saveContact(@RequestBody Contact contact) {
		return contactService.saveContact(contact);
	}

	@RequestMapping("/{id}")
	public Contact findContactById(@PathVariable Long id) {
		return contactService.findContact(id);
	}

	@RequestMapping("/all")
	public List<Contact> contactsList() {
		return contactService.findAllContacts();
	}

	@RequestMapping("/delete/{id}")
	public String deleteContact(@PathVariable Long id) {
		return contactService.deleteContact(id);
	}
}
