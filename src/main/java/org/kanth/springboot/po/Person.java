package org.kanth.springboot.po;

public class Person {

	private String name;
	private int age;
	private String sex;
	private String pid;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
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

	public Person(String name, int age, String sex, String pid) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.pid = pid;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Person() {
		super();
	}


}
