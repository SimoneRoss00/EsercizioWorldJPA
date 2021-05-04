package it.objectmethod.worldjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.worldjpa.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	public City findBycityName(String name);

	public List<City> findBycityCountryCode(String code);
}
