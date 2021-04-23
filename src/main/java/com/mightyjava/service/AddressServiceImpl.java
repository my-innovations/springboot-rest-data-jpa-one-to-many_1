package com.mightyjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightyjava.entity.Address;
import com.mightyjava.repository.AddressRepository;
import com.mightyjava.repository.ContactRepository;

@Service
public class AddressServiceImpl implements AddressService {

	private ContactRepository friendRepository;
	private AddressRepository addressRepository;

	@Autowired // optional
	public AddressServiceImpl(AddressRepository addressRepository, ContactRepository friendRepository) {
		this.addressRepository = addressRepository;
		this.friendRepository = friendRepository;
	}

	@Override
	public Address saveAddress(Address address) {
		address.setFriend(friendRepository.findById(address.getContactId()).get());
		return addressRepository.save(address);
	}

	@Override
	public List<Address> addressList() {
		return addressRepository.findAll();
	}

	@Override
	public Address findAddressById(Long id) {
		return addressRepository.findById(id).get();
	}

	@Override
	public Address updateAddress(Address address) {
		address.setFriend(friendRepository.findById(address.getContactId()).get());
		return addressRepository.save(address);
	}

	@Override
	public String deleteAddress(Long id) {
		addressRepository.deleteById(id);
		return "{'message':'address deleted successfully'}";
	}
}
