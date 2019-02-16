package com.manifestcorp.techreads.model;

import java.util.ArrayList;
import java.util.List;

public enum Rating {
	LIKE_IT (1),
	LOVE_IT (2),
	GOTTA_HAVE_IT (3);
	
	final int value;
	final List<String> list = new ArrayList<String>();
	
	Rating(int val) {
		this.value = val;
	}
	
	public String toString() {
		return this.name();
	}
	
	
	//List<Rating> ratingList = new ArrayList<Rating>();
	
	
	
	
}
