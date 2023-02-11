package com.acn.nemo.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.util.List;


/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name="locations")
@Data
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="location_id", unique=true, nullable=false)
	private Integer locationId;

	@Column(nullable=false, length=30)
	private String city;

	@Column(name="postal_code", length=12)
	private String postalCode;

	@Column(name="state_province", length=25)
	private String stateProvince;

	@Column(name="street_address", length=40)
	private String streetAddress;

	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="location", fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Department> departments;

	//bi-directional many-to-one association to Country
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="country_id", nullable=false)
	@JsonIgnore
	private Country country;


}