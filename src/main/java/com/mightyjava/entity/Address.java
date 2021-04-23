package com.mightyjava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addr_seq")
	@SequenceGenerator(initialValue = 1, name = "addr_seq", sequenceName = "addr_sequence")
	private Long addressId;
	private String city;
	private String state;
	private String country;
	private String category;

	// for updating the address for the below friendId.
	private transient Long contactId;

	
	@ManyToOne
	@JoinColumn(name = "contact_id") // FK column in Address table
	private Contact contact;

	

}
