package com.wipro.cfw;

public class Flowers {
			
	
	private String name;
	private int rating;
	
	public int getRating() {
		return rating;
		}
			
	public void setMarks(int rating) { 
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Object o)
	{
		return Integer.compare(((Flowers) o).getRating(),this.getRating());
		//int i=8; long l=(long)i;   compare(int a,int b)
	}

	public void setRating(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setRating(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
