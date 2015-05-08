package com.levinlee.commonviewholder;

public class Person {
	
	private String name;
	private int age;
	private String des;
	
	public Person(String name,int age,String des){
		this.name = name;
		this.age = age;
		this.des = des;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	
	public String toString(){
		return "Ãû³Æ="+this.name+", age="+this.age +" ,des =" +this.des;
				
	}
	
	
}
