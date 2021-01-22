package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.Address;

public interface AddressService {
	
	Address saveAddress(Address address);
	Address findAddressById(Long id);
	List<Address> addressList();
	public Address updateAddress(Address address);
	String deleteAddress(Long id);
}
