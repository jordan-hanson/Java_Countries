package com.lambdaschool.countries.controllers;

import com.lambdaschool.countries.models.Country;
import com.lambdaschool.countries.repositories.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountriesController {

    @Autowired
    private CountriesRepository countriesRepository;

    //http://localhost:2019/countries/names/all

    @GetMapping(value = "/countries/names/all", produces = "application/json")
    public ResponseEntity<?> listAllCountries(){
        List<Country> countryList = new ArrayList<>();
        countriesRepository.findAll().iterator().forEachRemaining(countryList::add);
        return new ResponseEntity<>(countryList, HttpStatus.OK);
    }

    //http://localhost:2019/countries/names/start/u



    //http://localhost:2019/countries/population/total



    //http://localhost:2019/countries/population/min



    //http://localhost:2019/countries/population/max


}
