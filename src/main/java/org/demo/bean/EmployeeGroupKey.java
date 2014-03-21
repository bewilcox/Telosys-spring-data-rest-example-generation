/*
 * Created on 20 mars 2014 ( Time 12:14:05 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package org.demo.bean;
import java.io.Serializable;

import javax.persistence.*;

/**
 * Composite primary key for entity "EmployeeGroup" ( stored in table "EMPLOYEE_GROUP" )
 *
 * @author Telosys Tools Generator
 *
 */
 @Embeddable
public class EmployeeGroupKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="EMPLOYEE_CODE", nullable=false, length=4)
    private String     employeeCode ;
    
    @Column(name="GROUP_ID", nullable=false)
    private Short      groupId      ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public EmployeeGroupKey()
    {
        super();
    }

    public EmployeeGroupKey( String employeeCode, Short groupId )
    {
        super();
        this.employeeCode = employeeCode ;
        this.groupId = groupId ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setEmployeeCode( String value )
    {
        this.employeeCode = value;
    }
    public String getEmployeeCode()
    {
        return this.employeeCode;
    }

    public void setGroupId( Short value )
    {
        this.groupId = value;
    }
    public Short getGroupId()
    {
        return this.groupId;
    }


    //----------------------------------------------------------------------
    // equals METHOD
    //----------------------------------------------------------------------
	public boolean equals(Object obj) { 
		if ( this == obj ) return true ; 
		if ( obj == null ) return false ;
		if ( this.getClass() != obj.getClass() ) return false ; 
		EmployeeGroupKey other = (EmployeeGroupKey) obj; 
		//--- Attribute employeeCode
		if ( employeeCode == null ) { 
			if ( other.employeeCode != null ) 
				return false ; 
		} else if ( ! employeeCode.equals(other.employeeCode) ) 
			return false ; 
		//--- Attribute groupId
		if ( groupId == null ) { 
			if ( other.groupId != null ) 
				return false ; 
		} else if ( ! groupId.equals(other.groupId) ) 
			return false ; 
		return true; 
	} 


    //----------------------------------------------------------------------
    // hashCode METHOD
    //----------------------------------------------------------------------
	public int hashCode() { 
		final int prime = 31; 
		int result = 1; 
		
		//--- Attribute employeeCode
		result = prime * result + ((employeeCode == null) ? 0 : employeeCode.hashCode() ) ; 
		//--- Attribute groupId
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode() ) ; 
		
		return result; 
	} 


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString()
    {
		StringBuffer sb = new StringBuffer(); 
		sb.append(employeeCode); 
		sb.append("|"); 
		sb.append(groupId); 
        return sb.toString();
    }
}