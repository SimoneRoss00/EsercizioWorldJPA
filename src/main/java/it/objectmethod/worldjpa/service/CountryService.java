package it.objectmethod.worldjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectmethod.worldjpa.entity.Country;
import it.objectmethod.worldjpa.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepo;

	public List<Country> countryInfoByNameOrContinent(String name, String continent) {
		List<Country> countryList = countryRepo.findCountryInfoByNameOrContinent(name, continent);
		return countryList;
	}

	public List<String> continentName() {
		List<String> continentList = countryRepo.findDistinctcontinent();
		return continentList;
	}

	public List<Country> countryInfoByContinent(String continentName) {
		List<Country> countryListByContinent = countryRepo.findBycontinent(continentName);
		return countryListByContinent;
	}

}
