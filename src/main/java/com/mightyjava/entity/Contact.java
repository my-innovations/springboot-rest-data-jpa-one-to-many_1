package com.mightyjava.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_seq")
	@SequenceGenerator(initialValue = 1, name = "c_seq", sequenceName = "contact_sequence")
	private Long cId;
	private String firstName;
	private String lastName;

	@OneToMany(targetEntity = Address.class, mappedBy = "contact", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Address> addresses;

	public Long getId() {
		return cId;
	}

	public void setId(Long id) {
		this.cId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Friend [id=" + cId + ", firstName=" + firstName + ", lastName=" + lastName + ", addresses=" + addresses
				+ "]";
	}

}
