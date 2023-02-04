package com.example.practicle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "mst_user")
public class TeacherBo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_id;
	
	@Email(regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\\\.[a-zA-Z.]{2,5}",message = "Please Enter Valid Email I'D.")
	@Column(name="email_id")
	private String email_id;
	
	@NotEmpty(message = "Please Enter Password.")
	@Column(name="password")
	private String password;
	
	@Pattern(regexp = "/^[a-zA-Z][a-zA-Z\\\\s]+$/",message = "Please Enter Only Alphabats.")
	@NotEmpty(message = "Please Enter Name.")
	@Column(name="name")
	private String name;
	
	@Pattern(regexp = "/^[a-zA-Z][a-zA-Z\\\\s]+$/",message = "Please Enter Only Alphabats.")
	@NotEmpty(message = "Please Enter User Name.")
	@Column(name="userName")
	private String userName;
	
	@NotEmpty(message = "Please Choose Gender.")
	@Column(name="gender")
	private char gender;
	
	@NotEmpty(message = "Please Enter Age")
	@Column(name="age")
	private int age;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = Integer.valueOf(age);
	}

	@Override
	public String toString() {
		return "TeacherBo [user_id=" + user_id + ", email_id=" + email_id + ", password=" + password + ", name=" + name
				+ ", userName=" + userName + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
