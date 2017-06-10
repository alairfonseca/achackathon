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
@Table(name = "ROLE")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROLE_ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "PROFILE_RULE")
	@JoinColumn(name = "PROFILE_RULE_ID")
	private List<ProfileRule> rules;

}
