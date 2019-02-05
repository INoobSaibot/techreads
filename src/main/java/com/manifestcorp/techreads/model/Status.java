package com.manifestcorp.techreads.model;

public enum Status {
	
	Read (0),
	CURRENTLY_READING (1),
	WANT_TO_READ (2);
	
	final int value; 
	
	Status(int value) {
		this.value = value;
	}
	
	public String toString() {
		return Integer.toString(this.value);
	
	}
}
