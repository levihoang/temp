package com.pts.findInternship.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name = "username",unique = true, nullable = false,columnDefinition = "VARCHAR(200)")
	private String username;
	@Column(name = "password",nullable = false, columnDefinition = "VARCHAR(20)")
	private String password;
	private boolean gender;
	@Column(name = "avatar",columnDefinition = "VARCHAR(50)")
	private String avatar;
	@Column(name = "phone",columnDefinition = "VARCHAR(10)")
	private String phone;
	private String firstName;
	private String lastName;
	@Column(name = "email",length = 100)
	private String email;
	@Column(name = "create_Date",columnDefinition = "DATE")
	private LocalDate createDate;
	@Column(name = "status",columnDefinition = "NVARCHAR(15)")
	private String status;
	@OneToOne
	@JoinColumn(name = "Role_Id",nullable = true)
	private Role role;
}
