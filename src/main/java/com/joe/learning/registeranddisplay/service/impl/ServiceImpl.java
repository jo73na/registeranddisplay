package com.joe.learning.registeranddisplay.service.impl;

import com.joe.learning.registeranddisplay.entity.GeneralEnitity;
import com.joe.learning.registeranddisplay.repo.Repo;
import com.joe.learning.registeranddisplay.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements GeneralService {
    @Autowired
    private Repo repo;
    @Override
    public List<GeneralEnitity> getAllValues() {
        return   repo.findAll();
    }

    @Override
    public GeneralEnitity getValuesById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void addEntity(GeneralEnitity entity) {
repo.save(entity);
    }

    @Override
    public Boolean updateEntity(Long id,GeneralEnitity entity) {
        Optional<GeneralEnitity> companyOptional = repo.findById(id);

        if (companyOptional.isPresent()) {
            GeneralEnitity ent = companyOptional.get();
            ent.setDataOne(entity.getDataOne());
            ent.setDataTwo(entity.getDataTwo());
            ent.setDataThree(entity.getDataThree());
            // company.setJobs(updatedCompany.getJobs());
            repo.save(ent);
            return true;
        }

        return false;
    }

    @Override
    public Boolean deleteEntity(Long id) {
        try {
            repo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
