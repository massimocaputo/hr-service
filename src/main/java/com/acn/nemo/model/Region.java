package com.acn.nemo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * The Class Region.
 */
@Entity
@Table(name = "regions")


/**
 * Instantiates a new region.
 *
 * @param regionId the region id
 * @param regionName the region name
 * @param countries the countries
 */
@AllArgsConstructor

/**
 * Instantiates a new region.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data
@NamedQuery(name="Region.findAll", query="SELECT r FROM Region r")
public class Region implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 9018177869868944446L;

	/** The region id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="region_id", unique=true, nullable=false)
	private Long regionId;

	/** The region name. */
	@Column(name="region_name", length=25)
	private String regionName;

	/** The countries. */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "region")
	@JsonManagedReference
	//@ToString.Exclude
	private List<Country> countries = new ArrayList<>(); 
	
	/**
	 * Adds the country.
	 *
	 * @param country the country
	 * @return the country
	 */
	public Country addCountry(Country country) {
		getCountries().add(country);
		country.setRegion(this);

		return country;
	}

	/**
	 * Removes the country.
	 *
	 * @param country the country
	 * @return the country
	 */
	public Country removeCountry(Country country) {
		getCountries().remove(country);
		country.setRegion(null);

		return country;
	}

}