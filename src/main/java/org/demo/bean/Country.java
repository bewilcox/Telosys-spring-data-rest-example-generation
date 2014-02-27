/*
 * Created on 26 f�vr. 2014 ( Time 15:22:54 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.bean;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "COUNTRY"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="COUNTRY", schema="ROOT" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Country.countAll", query="SELECT COUNT(x) FROM Country x" )
} )
public class Country implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="CODE", nullable=false, length=2)
    private String     code         ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="NAME", length=45)
    private String     name         ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @OneToMany(mappedBy="country", targetEntity=Customer.class)
    private List<Customer> listOfCustomer;

    @OneToMany(mappedBy="country", targetEntity=Publisher.class)
    private List<Publisher> listOfPublisher;

    @OneToMany(mappedBy="country", targetEntity=Shop.class)
    private List<Shop> listOfShop  ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Country()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setCode( String code )
    {
        this.code = code ;
    }
    public String getCode()
    {
        return this.code;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : NAME ( VARCHAR ) 
    public void setName( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setListOfCustomer( List<Customer> listOfCustomer )
    {
        this.listOfCustomer = listOfCustomer;
    }
    public List<Customer> getListOfCustomer()
    {
        return this.listOfCustomer;
    }

    public void setListOfPublisher( List<Publisher> listOfPublisher )
    {
        this.listOfPublisher = listOfPublisher;
    }
    public List<Publisher> getListOfPublisher()
    {
        return this.listOfPublisher;
    }

    public void setListOfShop( List<Shop> listOfShop )
    {
        this.listOfShop = listOfShop;
    }
    public List<Shop> getListOfShop()
    {
        return this.listOfShop;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(code);
        sb.append("]:"); 
        sb.append(name);
        return sb.toString(); 
    } 

}