package com.mightyjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mightyjava.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	@Query("FROM Contact WHERE firstName = :firstName")
	Contact findByFirstname(@Param("firstName") String firstName);
}
