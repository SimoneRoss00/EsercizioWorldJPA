package it.objectmethod.worldjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.worldjpa.entity.Country;
import it.objectmethod.worldjpa.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService service;

	@GetMapping("/country-continent/name")
	public List<Country> viewCountryInfoByNameOrContinent(@RequestParam("countryName") String name,
			@RequestParam("continent") String continent) {
		List<Country> countryList = service.countryInfoByNameOrContinent(name, continent);
		return countryList;
	}

	@GetMapping("/continent")
	public List<String> viewContinent() {
		List<String> continentList = service.continentName();
		return continentList;
	}

	@GetMapping("/continent/{continentName}")
	public List<Country> viewCountryByContinentName(@PathVariable("continentName") String continentName) {
		List<Country> countryListByName = service.countryInfoByContinent(continentName);
		return countryListByName;
	}

}
