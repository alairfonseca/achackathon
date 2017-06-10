package com.hackathon.scalitimes.domains.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Pedro on 10/06/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String login;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	// @Transient
	// private List<Solicitations> solicitations;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "worked_hours")
	private List<WorkedHours> workedHours;

}
