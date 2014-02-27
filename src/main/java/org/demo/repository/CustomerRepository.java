/*
 * Created on 26 f�vr. 2014 ( Time 15:22:54 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.repository;

import org.demo.bean.Customer ;

import org.springframework.data.repository.CrudRepository;

import org.demo.bean.Country;
import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * Spring JPA Repository for Customer
 * 
 * @author Telosys Tools Generator
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, String> {

	@RestResource(rel="byCountry", path="byCountry")
	public List<Customer> findByCountry (
			@Param("country") Country country);


}