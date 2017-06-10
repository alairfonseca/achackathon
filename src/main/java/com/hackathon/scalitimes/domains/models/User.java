package com.hackathon.scalitimes.domains.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Pedro on 10/06/2017.
 */
@Getter
@Setter
@Entity
@Builder
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LOGIN")
	private String login;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PASSWORD")
	private String password;

	// @Transient
	// private List<Solicitations> solicitations;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "WORKED_HOURS")
	@JoinColumn(name = "WORKED_HOURS_ID")
	private List<WorkedHours> workedHours;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "ROLE")
	@JoinColumn(name = "ROLE_ID")
	private Role role;

}
