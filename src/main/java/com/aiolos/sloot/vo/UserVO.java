package com.aiolos.sloot.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserVO {
	private int seq;
	private String id;
	private String password;
	@JsonProperty("student_num")
	private int studentNum;
	private String name;
	private String position;
	private String sex;
	@JsonProperty("phone_number")
	private String phoneNumber;
	@JsonProperty("reg_date")
	private Date regDate;
	@JsonProperty("update_dates")
	private Date updateDate;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "UserVO [seq=" + seq + ", id=" + id + ", password=" + password + ", studentNum=" + studentNum + ", name="
				+ name + ", position=" + position + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", regDate="
				+ regDate + ", updateDate=" + updateDate + "]";
	}
}
