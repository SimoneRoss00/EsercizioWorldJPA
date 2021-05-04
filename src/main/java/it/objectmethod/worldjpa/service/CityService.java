package it.objectmethod.worldjpa.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectmethod.worldjpa.entity.City;
import it.objectmethod.worldjpa.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepo;

	public City cityByName(String cityName, HttpServletResponse response) {
		City city = cityRepo.findBycityName(cityName);
		if (city == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		return city;
	}

	public List<City> cityInfoByCountry(String countryCode) {
		List<City> cityList = cityRepo.findBycityCountryCode(countryCode);
		return cityList;
	}

}
