package com.tyss.elftraining.common;

public class Elf {

	public static void main(String[] args) {
//		StaticMethodClass.firstMethod();
//		StaticMethodClass.second();
//		StaticMethodClass.third();

//		firstMethod();
//		second();
//		third();
		
		SubClass class1 = new SubClass(10,"Sharath");
		SubClass class2 = new SubClass(20,"Mahesh");
		System.out.println(class1);
		System.out.println(class1.hashCode());
		System.out.println( class1.equals(class2) );
		

	}

}
