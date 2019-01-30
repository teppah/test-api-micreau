package com.micreau.test.api.apiv0.repository;

import com.micreau.test.api.apiv0.datamodel.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, Long> {

}
