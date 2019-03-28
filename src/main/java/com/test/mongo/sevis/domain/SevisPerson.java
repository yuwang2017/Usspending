package com.test.mongo.sevis.domain;

import java.io.Serializable;
import java.util.Date;

public class SevisPerson implements Serializable {
	
	private String firstName;
	private String lastName;
    private int age;
    private String portOfEntry;
    private String visaType;
    private String entryDate;
    
    public SevisPerson() {
    	
    }
    
    public SevisPerson (String firstName, String lastName, int age, String portOfEntry, String visaType, String entryDate) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.age = age;
    	this.portOfEntry = portOfEntry;
    	this.visaType = visaType;
    	this.entryDate = entryDate;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPortOfEntry() {
		return portOfEntry;
	}
	public void setPortOfEntry(String portOfEntry) {
		this.portOfEntry = portOfEntry;
	}
	public String getVisaType() {
		return visaType;
	}
	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

    
    
}
