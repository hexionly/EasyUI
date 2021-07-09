package com.hsx.easyui.domain;

import java.io.Serializable;

/**
 * @author HEXIONLY
 * @Date 2021年7月6日下午9:49:46
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	private String phone;
	private String address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String name, Integer age, String sex, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phone=" + phone
				+ ", address=" + address + "]";
	}
}
