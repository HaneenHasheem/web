package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="user")
@Table(name="users")
@JsonIgnoreProperties(ignoreUnknown = true)
public class user implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id  ;
	@Column
	private String fname;
	@Column
	private String lname;
	
	//@Column
	//private String email;
	
	@Column
	@JsonProperty("phone")
	private String phone;
	
	//@Column
	//private String password;
	@Column
	private double age;
	@Column
	private boolean Married;
	@Column
	private String How_Many_Children_Dose_He_Have;
	@Column
	private double Number_Of_Hours;
	@Column
	private double One_Hour;
	@Column
	private double Salary; 
	@Column
	private int Day;
	@Column
	private int Month;
	@Column
	private int Number_Of_Day;
	
	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public user() {}
	
	
	
	public user(int id, String fname, String lname, String phone, double age, boolean married,
			String how_Many_Children_Dose_He_Have, double number_Of_Hours, double one_Hour, double salary, int day,
			int month, int number_Of_Day) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.age = age;
		this.Married = married;
		this.How_Many_Children_Dose_He_Have = how_Many_Children_Dose_He_Have;
		this.Number_Of_Hours = number_Of_Hours;
		this.One_Hour = one_Hour;
		this.Salary = salary;
		this.Day = day;
		this.Month = month;
		this.Number_Of_Day = number_Of_Day;
	}

	/*public user(int id, String fname, String lname,double age, String email, String phone, String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		//this.email = email;
		this.phone = phone;
		//this.password = password;
		this.age = age;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	/*public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}*/
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/*public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}*/

	public boolean isMarried() {
		return Married;
	}

	public void setMarried(boolean married) {
		Married = married;
	}

	public String getHow_Many_Children_Dose_He_Have() {
		return How_Many_Children_Dose_He_Have;
	}

	public void setHow_Many_Children_Dose_He_Have(String how_Many_Children_Dose_He_Have) {
		How_Many_Children_Dose_He_Have = how_Many_Children_Dose_He_Have;
	}

	public double getNumber_Of_Hours() {
		return Number_Of_Hours;
	}

	public void setNumber_Of_Hours(double number_Of_Hours) {
		Number_Of_Hours = number_Of_Hours;
	}

	public double getOne_Hour() {
		return One_Hour;
	}

	public void setOne_Hour(double one_Hour) {
		One_Hour = one_Hour;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getNumber_Of_Day() {
		return Number_Of_Day;
	}

	public void setNumber_Of_Day(int number_Of_Day) {
		Number_Of_Day = number_Of_Day;
	}

	
	public  void Salary(){
		if(this.getMonth() == 30){
			double Final_Salary = this.getNumber_Of_Hours() *  this.getOne_Hour() * (30-this.getNumber_Of_Day());
			System.out.println("The Salary In This Month Is=" + Final_Salary); }
		else if(this.getMonth() == 31){
			double Final_Salary = this.getNumber_Of_Hours() *  this.getOne_Hour() * (31-this.getNumber_Of_Day());
			System.out.println("The Salary In This Month Is=" + Final_Salary);  }
		else if(this.getMonth() == 28){
			double Final_Salary = this.getNumber_Of_Hours() *  this.getOne_Hour() * (28-this.getNumber_Of_Day());
			System.out.println("The Salary In This Month Is=" + Final_Salary);  }
	}
}

