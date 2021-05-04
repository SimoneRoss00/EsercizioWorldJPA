package it.objectmethod.worldjpa.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.worldjpa.entity.City;
import it.objectmethod.worldjpa.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService service;

	@GetMapping("/name")
	public City viewCityByName(@RequestParam("CityName") String cityName, HttpServletResponse response) {
		City city = service.cityByName(cityName, response);
		return city;
	}

	@GetMapping("/country/{CountryCode}")
	public List<City> viewCityByCountryCode(@PathVariable("CountryCode") String countryCode) {
		List<City> cityList = service.cityInfoByCountry(countryCode);
		return cityList;
	}

}
