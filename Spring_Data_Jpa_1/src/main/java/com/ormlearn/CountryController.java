package com.ormlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    // Get All Countries
    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    // Get Country by Code
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code)
            throws CountryNotFoundException {

        return countryService.findCountryByCode(code);
    }

    // Add Country
    @PostMapping
    public String addCountry(@RequestBody Country country) {

        countryService.addCountry(country);

        return "Country Added Successfully";
    }

    // Update Country
    @PutMapping("/{code}")
    public String updateCountry(@PathVariable String code,
                                @RequestBody Country country)
            throws CountryNotFoundException {

        countryService.updateCountry(code, country.getName());

        return "Country Updated Successfully";
    }

    // Delete Country
    @DeleteMapping("/{code}")
    public String deleteCountry(@PathVariable String code) {

        countryService.deleteCountry(code);

        return "Country Deleted Successfully";
    }
}