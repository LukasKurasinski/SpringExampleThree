package com.SpringExampleThree.vehicles;

import com.SpringExampleThree.taxicos.Taxicos;
import com.SpringExampleThree.taxicos.TaxicosDTO;
import com.SpringExampleThree.taxicos.TaxicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehiclesService {

    @Autowired
    VehiclesRepository vehiclesRepository;

    public List<VehiclesDTO> getAllVehicles(){
        List<VehiclesDTO> vehiclesDTO = new ArrayList<>();
        vehiclesRepository.findAll().forEach(vehicles ->vehiclesDTO.add(this.mapToDTO(vehicles)));
        return vehiclesDTO;
    }
    public List<VehiclesDTO> getTaxicosForVehicle(Integer id){
       Optional<Vehicles> vehicles = vehiclesRepository.findById(id).map(vehicle ->{
            vehicle.getTaxicos().size();
            return vehicle;
        } );

        return vehicles.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());

    }

    private TaxicosDTO mapToDTO(Taxicos taxicos) {
        TaxicosDTO dto = new TaxicosDTO();
        dto.setId(taxicos.getId());
        dto.setName(taxicos.getName());

        return dto;
    }
    private VehiclesDTO mapToDTO(Vehicles vehicles) {
        VehiclesDTO dto = new VehiclesDTO();
        dto.setId(vehicles.getId());
        dto.setYear(vehicles.getYear());
        dto.setTaxicos(vehicles.getTaxicos().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList()));
        return dto;
    }



}
