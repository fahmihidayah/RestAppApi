package com.widsons.restapiapp.data.model;

import com.google.gson.annotations.SerializedName;
// step ke 3 generate model
// plugin pojo generator di preference
public class
Todo{

	@SerializedName("is_done")
	private boolean isDone;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public boolean isIsDone(){
		return isDone;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}
}