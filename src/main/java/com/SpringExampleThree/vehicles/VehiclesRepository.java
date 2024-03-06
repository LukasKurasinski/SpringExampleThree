package com.SpringExampleThree.vehicles;

import com.SpringExampleThree.taxicos.Taxicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehiclesRepository extends CrudRepository<Vehicles, Integer> {

}
