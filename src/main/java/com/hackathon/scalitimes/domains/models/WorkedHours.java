package com.hackathon.scalitimes.domains.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
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
@Table(name = "WORKED_HOURS")
public class WorkedHours {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "WORKED_HOURS_ID")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "USER")
	@JoinColumn(name = "USER_ID")
	private User user;

	@Column(name = "DATE")
	private LocalDate date;

	@Column(name = "TIME")
	private LocalTime time;

	@Column(name = "LATITUDE")
	private String latitude;

	@Column(name = "LONGITUDE")
	private String longitude;
}
