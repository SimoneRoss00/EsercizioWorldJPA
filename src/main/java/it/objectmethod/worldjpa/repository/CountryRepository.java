package it.objectmethod.worldjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.worldjpa.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	@Query(value = "SELECT country FROM Country country WHERE ((''=?1 OR country.countryName=?1)) AND ((''=?2 OR country.continent=?2))")
	public List<Country> findCountryInfoByNameOrContinent(String countryName, String continent);

	@Query(value = "SELECT DISTINCT continent FROM Country")
	public List<String> findDistinctcontinent();

	public List<Country> findBycontinent(String name);

}
