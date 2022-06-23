package com.pandora.enabiz.service.abstracts;

import com.pandora.enabiz.model.City;

import java.util.List;

public interface CityService {

    List<City> getAllCities();

    City save(City city);

}
