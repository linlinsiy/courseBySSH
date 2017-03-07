package com.jwxt.model.lesson.entity;

public class Lesson {

	private int lesId;
	private String lesName;
	private String lesTime;
	public int getLesId() {
		return lesId;
	}
	public void setLesId(int lesId) {
		this.lesId = lesId;
	}
	public String getLesName() {
		return lesName;
	}
	public void setLesName(String lesName) {
		this.lesName = lesName;
	}
	public String getLesTime() {
		return lesTime;
	}
	public void setLesTime(String lesTime) {
		this.lesTime = lesTime;
	}
	@Override
	public String toString() {
		return "Lesson [lesId=" + lesId + ", lesName=" + lesName + ", lesTime="
				+ lesTime + "]";
	}
	
}
