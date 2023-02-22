package com.acn.nemo.model;

import java.io.Serializable;
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

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the regions database table.
 * 
 */
@Entity
@Table(name="regions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="Region.findAll", query="SELECT r FROM Region r")
public class Region implements Serializable {
	

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7297550691058136283L;

	/** The region id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="region_id", unique=true, nullable=false)
	@ApiModelProperty(notes = "The database generated product ID")
	private Long regionId;

	/** The region name. */
	@Column(name="region_name", length=25)
	private String regionName;

	/** The countries. */
	//bi-directional many-to-one association to Country
	@OneToMany(mappedBy="region", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Country> countries;


}