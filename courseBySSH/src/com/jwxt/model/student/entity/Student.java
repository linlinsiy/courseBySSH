package com.jwxt.model.student.entity;

import java.util.Date;

public class Student{
	//学号
	private int stuId;
	//密码
	private String stuPwd;
	//姓名
	private String stuName;
	//性别
	private Boolean stuGender;
	//出生日期
	private Date stuBirth;
	//班级
	private String stuClass;
	//头像
	private String stuPic;
	
	
	
	public Student() {
		super();
	}	
	public Student(String stuName) {
		super();
		this.stuName = stuName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Boolean getStuGender() {
		return stuGender;
	}
	public void setStuGender(Boolean stuGender) {
		this.stuGender = stuGender;
	}
	public Date getStuBirth() {
		return stuBirth;
	}
	public void setStuBirth(Date stuBirth) {
		this.stuBirth = stuBirth;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	public String getStuPic() {
		return stuPic;
	}
	public void setStuPic(String stuPic) {
		this.stuPic = stuPic;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuPwd=" + stuPwd + ", stuName="
				+ stuName + ", stuGender=" + stuGender + ", stuBirth="
				+ stuBirth + ", stuClass=" + stuClass + "]";
	}
	
}
