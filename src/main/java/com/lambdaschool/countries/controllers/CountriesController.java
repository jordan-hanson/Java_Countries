package com.lambdaschool.countries.controllers;

import com.lambdaschool.countries.CheckCountry;
import com.lambdaschool.countries.models.Country;
import com.lambdaschool.countries.repositories.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value = "/countries/name/{letter}", produces = "application/json")
    public ResponseEntity<?> findByNameLetter(@PathVariable char letter){
        List<Country> letterList = new ArrayList<>();
        countriesRepository.findAll().iterator().forEachRemaining(letterList::add);

        List<Country> filteredList = filterCountry(letterList, (e) -> e.getName().charAt(0) == letter);
        return new ResponseEntity<>(filteredList, HttpStatus.OK);
    }

    private List<Country> filterCountry(List<Country> countryList, CheckCountry tester){
        List<Country> returnList = new ArrayList<>();
        for(Country c : countryList){
            if(tester.test(c)) {
                returnList.add(c);
            }
        }
        return returnList;
    }


    //http://localhost:2019/countries/population/total

    @GetMapping(value = "/countries/population/total", produces = "application/json")
    public ResponseEntity<?> listPopulationTotal(){
        List<Country> totalList = new ArrayList<>();
        countriesRepository.findAll().iterator().forEachRemaining(totalList::add);

        int total = 0;
        for (Country c: totalList){
            total += c.getPopulation();
        }
        System.out.println("The Total population is: " + total);
        return new ResponseEntity<>(total, HttpStatus.OK);
    }

    //http://localhost:2019/countries/population/min



    //http://localhost:2019/countries/population/max


}
