package com.hackathon.scalitimes.domains.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Pedro on 10/06/2017.
 */
@Getter
@Setter
@Entity
@Builder
@Table(name = "PROFILE_RULE")
public class ProfileRule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PROFILE_RULE_ID")
	private Long id;

	@Column(name="NAME")
	private String name;

	@Column(name="VALUE")
	private Long value;

	@Column(name="TYPE")
	private Integer type;

}
