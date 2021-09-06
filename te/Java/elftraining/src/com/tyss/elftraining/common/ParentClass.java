package com.tyss.elftraining.common;

public class ParentClass {

	int id ;
	String name ;
	
	public ParentClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ParentClass [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	public boolean equals(ParentClass obj) {
		
		return this.id == obj.id;
	}
//	public  ParentClass(int id , String name) {
//		this.id = id;
//		this.name = name;
//	}
	
//	@Override
//	public String toString() {
//		String details = " ID is "+ this.id +" name is "+ this.name;
//		return details;
//		
//	}
	
}
