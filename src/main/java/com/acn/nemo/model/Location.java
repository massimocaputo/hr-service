package com.acn.nemo.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name="locations")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	@JsonManagedReference
	private List<Department> departments;

	//bi-directional many-to-one association to Country
	@ManyToOne(fetch=FetchType.LAZY)
	@EqualsAndHashCode.Exclude
	@JoinColumn(name="country_id", nullable=false)
	@JsonBackReference
	private Country country;


}