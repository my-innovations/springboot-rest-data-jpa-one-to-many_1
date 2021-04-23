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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_seq")
	@SequenceGenerator(initialValue = 1, name = "c_seq", sequenceName = "contact_sequence")
	private Long contactId;
	private String firstName;
	private String lastName;

	@JsonIgnore
	@OneToMany(targetEntity = Address.class, mappedBy = "contact", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Address> addresses;
}
