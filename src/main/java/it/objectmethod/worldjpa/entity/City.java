package it.objectmethod.worldjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@Column(name = "Name")
	private String cityName;

	@Column(name = "country_code")
	private String cityCountryCode;

	@Column(name = "District")
	private String cityDistrict;

	@Column(name = "Population")
	private Integer cityPopulation;

	public Long getCityId() {
		return id;
	}

	public void setCityId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCountryCode() {
		return cityCountryCode;
	}

	public void setCityCountryCode(String cityCountryCode) {
		this.cityCountryCode = cityCountryCode;
	}

	public String getCityDistrict() {
		return cityDistrict;
	}

	public void setCityDistrict(String cityDistrict) {
		this.cityDistrict = cityDistrict;
	}

	public Integer getCityPopulation() {
		return cityPopulation;
	}

	public void setCityPopulation(Integer cityPopulation) {
		this.cityPopulation = cityPopulation;
	}

}
