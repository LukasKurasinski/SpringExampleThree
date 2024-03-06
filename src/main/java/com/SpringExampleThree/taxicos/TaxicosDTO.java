package com.SpringExampleThree.taxicos;

import com.SpringExampleThree.vehicles.VehiclesDTO;
import lombok.Data;

import java.util.List;

@Data
public class TaxicosDTO {

    private Integer id;
    private String name;
    List<VehiclesDTO> vehicles;

}
