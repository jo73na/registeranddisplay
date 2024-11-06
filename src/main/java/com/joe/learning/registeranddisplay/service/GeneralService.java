package com.joe.learning.registeranddisplay.service;

import com.joe.learning.registeranddisplay.entity.GeneralEnitity;

import java.util.List;
public interface GeneralService {
    public List<GeneralEnitity> getAllValues();

    public GeneralEnitity getValuesById(Long id);

    public void addEntity(GeneralEnitity entity);

    public Boolean updateEntity(Long id,GeneralEnitity entity);

    public Boolean deleteEntity(Long id);

}
