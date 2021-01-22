package com.mightyjava.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mightyjava.entity.Address;
import com.mightyjava.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressRestController {
	
	private AddressService addressService;

	@Autowired
	public AddressRestController(AddressService addressService) {
		this.addressService = addressService;
	}
	
	@RequestMapping("/save")
	public Address saveAddress(@RequestBody Address address) {
		return addressService.saveAddress(address);
	}
	
	@RequestMapping("/{id}")
	public Address findAddress(@PathVariable Long id) {
		return addressService.findAddressById(id);
	}
	
	@RequestMapping("/all")
	public List<Address> addressList() {
		return addressService.addressList();
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteAddress(@PathVariable Long id) {
		return addressService.deleteAddress(id);
	}
	
}
