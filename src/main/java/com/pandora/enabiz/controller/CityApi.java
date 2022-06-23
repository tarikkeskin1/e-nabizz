package com.pandora.enabiz.controller;

import com.pandora.enabiz.model.City;
import com.pandora.enabiz.service.abstracts.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CityApi {
    private final CityService cityService;

    public CityApi(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @PostMapping("/city")
    public City createCity(@RequestBody City city) {
        return cityService.save(city);
    }
}
