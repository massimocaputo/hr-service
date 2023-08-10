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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The Class Location.
 */
@Entity
@Table(name = "LOCATIONS")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new location.
 */
@NoArgsConstructor

/**
 * Instantiates a new location.
 *
 * @param locationId the location id
 * @param streetAddress the street address
 * @param postalCode the postal code
 * @param city the city
 * @param stateProvince the state province
 * @param country the country
 * @param departments the departments
 */

@AllArgsConstructor
public class Location implements Serializable{

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1601821887869532536L;

	/** The location id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOCATIONS_SEQ")
	@SequenceGenerator(name = "LOCATIONS_SEQ", sequenceName = "LOCATIONS_SEQ", initialValue = 1, allocationSize = 100)
	@Column(name = "LOCATION_ID", nullable = false, unique = true)
	private Long locationId;
	
	/** The street address. */
	@Column(name="STREET_ADDRESS", nullable = true, length = 40)
	private String streetAddress;
	
	/** The postal code. */
	@Column(name="POSTAL_CODE", nullable = true, length = 12)
	private String postalCode;
	
	/** The city. */
	@Column(name="CITY", nullable = false, length = 30)
	private String city;
	
	/** The state province. */
	@Column(name="STATE_PROVINCE", nullable = true, length = 25)
	private String stateProvince;
	
	/** The country. */
	@ManyToOne
	@JoinColumn(name = "country_id")
	@EqualsAndHashCode.Exclude
	@JsonBackReference
	private Country country;
	
	/** The departments. */
	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="location", fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Department> departments = new ArrayList<>();
	
	/**
	 * Adds the department.
	 *
	 * @param department the department
	 * @return the department
	 */
	public Department addDepartment(Department department) {
		getDepartments().add(department);
		department.setLocation(this);

		return department;
	}

	/**
	 * Removes the department.
	 *
	 * @param department the department
	 * @return the department
	 */
	public Department removeDepartment(Department department) {
		getDepartments().remove(department);
		department.setLocation(null);

		return department;
	}
	
}
