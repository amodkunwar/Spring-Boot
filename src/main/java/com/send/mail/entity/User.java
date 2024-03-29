package com.send.mail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "email")
	private String userEmail;

	@Column(name = "name")
	private String userName;

	@Column(name = "location")
	private String userLocation;

	@Column(name = "qualification")
	private String userQualification;

	@Column(name = "percentage")
	private String userPercentage;

	@Column(name = "mobile")
	private String userMobile;

	@Column(name = "password")
	private String userPassword;

	public User() {
	}

	public User(String userEmail, String userName, String userLocation, String userQualification, String userPercentage,
			String userMobile, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userLocation = userLocation;
		this.userQualification = userQualification;
		this.userPercentage = userPercentage;
		this.userMobile = userMobile;
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String getUserQualification() {
		return userQualification;
	}

	public void setUserQualification(String userQualification) {
		this.userQualification = userQualification;
	}

	public String getUserPercentage() {
		return userPercentage;
	}

	public void setUserPercentage(String userPercentage) {
		this.userPercentage = userPercentage;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userName=" + userName + ", userLocation=" + userLocation
				+ ", userQualification=" + userQualification + ", userPercentage=" + userPercentage + ", userMobile="
				+ userMobile + ", userPassword=" + userPassword + "]";
	}

}
