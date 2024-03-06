package com.SpringExampleThree.vehicles;

import com.SpringExampleThree.taxicos.Taxicos;
import com.SpringExampleThree.taxicos.TaxicosDTO;
import lombok.Data;

import java.util.List;

@Data
public class VehiclesDTO {
    private Integer id;
    private Integer year;
    List<TaxicosDTO> taxicos;
}
