package com.pandora.enabiz.service.concretes;

import com.pandora.enabiz.model.City;
import com.pandora.enabiz.repository.CityRepo;
import com.pandora.enabiz.service.abstracts.CityService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {

    private final CityRepo cityRepo;


    public CityServiceImpl(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }


    @Override
    public List<City> getAllCities() {
        return cityRepo.findAll();
    }

    @Override
    public City save(City city) {
        return cityRepo.save(city);
    }
}
