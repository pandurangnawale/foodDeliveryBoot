package com.yash.fooddelivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Transient;
@Entity
@Table(name="usermaster")
public class User {

	@Id //primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	@NotNull
	private String firstName;
	
	@Column
	@NotNull
	private String lastName;
	
	@Column
	@Size(min=4)
	@NotNull
	private String userId;
	
	@Column
	@NotNull
	private String password;
	
	@Column
	@NotNull
	private String mobile;
	
	@Column
	private String email;
	
	/*@Column
	@Temporal(TemporalType.DATE)
	private Date birthDate;*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
*/
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userId=" + userId
				+ ", password=" + password + ", mobile=" + mobile + ", email=" + email + "]";
	}	

	

}
