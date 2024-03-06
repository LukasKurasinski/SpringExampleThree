package com.SpringExampleThree.taxicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaxicosService {

    @Autowired
    TaxicosRepository taxicosRepository;

    //This is an example of infinite recursion / circular query problem
    //Taxicos have a list of Vehicles and Vehicles have a list of Taxicos
    //While trying to populated list, Spring Boot is going deeper and deeper
    //in populating next list. Check out getVehicles to see how to avoid this problem
    public Iterable<Taxicos> getTaxicos(){
        return taxicosRepository.findAll();
    }
}
