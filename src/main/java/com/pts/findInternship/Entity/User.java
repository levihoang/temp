package com.pts.findInternship.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "User")
public class User {
	@Id
	@Column(name = "username",unique = true, nullable = false)
	private String username;
	private String password;
	private boolean gender;
	private String avatar;
	private String phone;
	private String firstName;
	private String lastName;
	private String email;
	private Date createDate;
	private String status;
	@OneToOne
	@JoinColumn(name = "Role_Id")
	private Role role;
}
