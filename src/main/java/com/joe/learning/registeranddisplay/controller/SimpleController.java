package com.joe.learning.registeranddisplay.controller;


import com.joe.learning.registeranddisplay.entity.GeneralEnitity;
import com.joe.learning.registeranddisplay.service.GeneralService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/general/")
public class SimpleController {
    @Autowired
    private GeneralService entService;

    @GetMapping
    public ResponseEntity<List> findAllCompany() {
        List<GeneralEnitity> all = entService.getAllValues();
        if (!all.isEmpty()) {
            return new ResponseEntity<>(all, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneralEnitity> getCompanyById(@PathVariable Long id) {
        GeneralEnitity entity = entService.getValuesById(id);
        if (entity != null) {
            return new ResponseEntity<>(entity, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<String> createGeneralEnitity(@RequestBody GeneralEnitity entity) {
        entService.addEntity(entity);
        return new ResponseEntity<>("entity added successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompanyById(@PathVariable Long id) {
        Boolean entity = entService.deleteEntity(id);
        if (entity) {
            return new ResponseEntity<>("entity is deleted", HttpStatus.OK);
        }
        return new ResponseEntity<>("entity was not found", HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompanyById(@PathVariable Long id, @RequestBody GeneralEnitity entity) {
        Boolean updateStatus = entService.updateEntity(id, entity);

        if (updateStatus) {
            return new ResponseEntity<>("entity is updated", HttpStatus.OK);
        }
        return new ResponseEntity<>("entity was not found", HttpStatus.NOT_FOUND);
    }



}

