package com.manifestcorp.techreads.model;

public enum Rating {
	LIKE_IT (1),
	LOVE_IT (2),
	GOTTA_HAVE_IT (3);
	
	final int value;
	
	Rating(int val) {
		this.value = val;
	}
	
	//List<Rating> ratingList = new ArrayList<Rating>();
	
	
	
	
}
