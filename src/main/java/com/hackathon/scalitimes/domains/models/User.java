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
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "role")
	private Role role;

}
