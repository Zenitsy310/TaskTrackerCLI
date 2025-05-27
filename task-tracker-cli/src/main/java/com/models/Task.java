package com.models;

import java.util.Calendar;

public class Task {
	
	private int id;
	private String description;
	private Statuses status;
	private Calendar createdAt;
	private Calendar updateAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Statuses getStatus() {
		return status;
	}
	public void setStatus(Statuses status) {
		this.status = status;
	}
	public Calendar getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}
	public Calendar getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Calendar updateAt) {
		this.updateAt = updateAt;
	}

}
