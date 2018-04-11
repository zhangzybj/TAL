package com.tal.xes.service;

import java.util.List;

import com.tal.xes.service.dto.CountryDTO;

/**
 * Service Interface for managing Country.
 */
public interface CountryService {

    /**
     * Save a country.
     *
     * @param countryDTO the entity to save
     * @return the persisted entity
     */
    CountryDTO save(CountryDTO countryDTO);

    /**
     * Get all the countries.
     *
     * @return the list of entities
     */
    List<CountryDTO> findAll();

    /**
     * Get the "id" country.
     *
     * @param id the id of the entity
     * @return the entity
     */
    CountryDTO findOne(Long id);

    /**
     * Delete the "id" country.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
