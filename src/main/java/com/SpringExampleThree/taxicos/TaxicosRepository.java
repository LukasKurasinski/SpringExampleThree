package com.SpringExampleThree.taxicos;

import com.SpringExampleThree.vehicles.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxicosRepository extends CrudRepository<Taxicos, Integer> {

}
