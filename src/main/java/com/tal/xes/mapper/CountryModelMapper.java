package com.tal.xes.mapper;

import com.tal.xes.domain.CountryModel;

public interface CountryModelMapper {
    int insert(CountryModel record);

    int insertSelective(CountryModel record);
}