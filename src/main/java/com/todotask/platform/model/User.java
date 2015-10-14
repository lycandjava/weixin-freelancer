package com.todotask.platform.model;

import net.sf.json.JSONObject;

import com.todotask.platform.model.support.JsonSupport;

public class User implements JsonSupport{

	private String id;
	private String username;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
 

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toJson() {
		JSONObject jsonObject = JSONObject.fromObject(this);
		return jsonObject.toString();
	}
}
