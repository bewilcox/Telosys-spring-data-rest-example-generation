/*
 * Created on 20 mars 2014 ( Time 12:14:05 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.repository;

import org.demo.bean.Review ;

import org.springframework.data.repository.CrudRepository;

import org.demo.bean.ReviewKey ;
import org.demo.bean.Book;
import org.demo.bean.Customer;
import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;



/**
 * Spring JPA Repository for Review
 * 
 * @author Telosys Tools Generator
 *
 */
public interface ReviewRepository extends CrudRepository<Review, ReviewKey> {

	@RestResource(rel="byBook", path="byBook")
	public List<Review> findByBook (
			@Param("book") Book book);

	@RestResource(rel="byCustomer", path="byCustomer")
	public List<Review> findByCustomer (
			@Param("customer") Customer customer);


}