package it.objectmethod.worldjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String Code;

	@Column(name = "Name")
	private String countryName;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Region")
	private String region;

	@Column(name = "SurfaceArea")
	private Integer surfaceArea;

	@Column(name = "IndepYear")
	private Integer indepYear;

	@Column(name = "Population")
	private Integer countryPopulatin;

	@Column(name = "LifeExpectancy")
	private Integer lifeExpectancy;

	@Column(name = "GNP")
	private Integer GNP;

	@Column(name = "GNPOld")
	private Integer GNPOld;

	@Column(name = "LocalName")
	private String localName;

	@Column(name = "GovernmentForm")
	private String governmentForm;

	@Column(name = "HeadOfState")
	private String headOfState;

	public String getCountryCode() {
		return Code;
	}

	public void setCountryCode(String Code) {
		this.Code = Code;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(Integer surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public Integer getIndepYear() {
		return indepYear;
	}

	public void setIndepYear(Integer indepYear) {
		this.indepYear = indepYear;
	}

	public Integer getCountryPopulatin() {
		return countryPopulatin;
	}

	public void setCountryPopulatin(Integer countryPopulatin) {
		this.countryPopulatin = countryPopulatin;
	}

	public Integer getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(Integer lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Integer getGNP() {
		return GNP;
	}

	public void setGNP(Integer gNP) {
		GNP = gNP;
	}

	public Integer getGNPOld() {
		return GNPOld;
	}

	public void setGNPOld(Integer gNPOld) {
		GNPOld = gNPOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
}
