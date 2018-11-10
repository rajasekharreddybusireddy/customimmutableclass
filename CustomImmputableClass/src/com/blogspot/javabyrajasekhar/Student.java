package com.blogspot.javabyrajasekhar;

public final class Student {
	
	private final Integer rollno;
	private final String name;
	private final Double marks;
	public Student(Integer rollno, String name, Double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public Integer getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public Double getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
