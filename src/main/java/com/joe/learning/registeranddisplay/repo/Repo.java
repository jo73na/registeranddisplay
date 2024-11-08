package com.joe.learning.registeranddisplay.repo;

import com.joe.learning.registeranddisplay.entity.GeneralEnitity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repo extends JpaRepository<GeneralEnitity, Long> {

}
