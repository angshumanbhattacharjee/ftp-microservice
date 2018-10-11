package com.cloud.dbservice.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Details.class)
@Document(collection="details")
public class Details {

	
	 @Id
	 public ObjectId _id; 
	String username; String age,gender;
	
	 

	public Details() {
		super();
	}

	public Details(ObjectId _id, String username, String age, String gender) {
		super();
		this._id = _id;
		this.username = username;
		this.age = age;
		this.gender = gender;
	}

	/**
	 * @return the id
	 */
	 public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Details [_id=" + _id + ", username=" + username + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
