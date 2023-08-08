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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The Class Country.
 */
@Entity
@Table(name = "COUNTRIES")


/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new country.
 *
 * @param countryId the country id
 * @param countryName the country name
 * @param region the region
 * @param locations the locations
 */
@AllArgsConstructor

/**
 * Instantiates a new country.
 */
@NoArgsConstructor
public class Country implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -569466226496521715L;

	/** The country id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_id", nullable = false, unique = true)
	private String countryId;
	
	/** The country name. */
	@Column(name = "country_name", nullable = true, length = 60 )
	private String countryName;
	
	/** The region. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REGION_ID", referencedColumnName = "region_id")
	@JsonBackReference
	private Region region;
	
	/** The location list. */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "country")
	@JsonManagedReference
	private List<Location> locations = new ArrayList<>();
	
	/**
	 * Adds the location.
	 *
	 * @param location the location
	 * @return the location
	 */
	public Location addLocation(Location location) {
		getLocations().add(location);
		location.setCountry(this);

		return location;
	}

	/**
	 * Removes the location.
	 *
	 * @param location the location
	 * @return the location
	 */
	public Location removeLocation(Location location) {
		getLocations().remove(location);
		location.setCountry(null);

		return location;
	}
	
}
