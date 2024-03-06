package com.SpringExampleThree.vehicles;

import com.SpringExampleThree.taxicos.Taxicos;
import com.SpringExampleThree.taxicos.TaxicosDTO;
import com.SpringExampleThree.taxicos.TaxicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehiclesController {
    @Autowired
    private VehiclesService vehiclesService;

    @GetMapping(value = "/vehicles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<VehiclesDTO>> vehicles(){
        List<VehiclesDTO> allVehicles = vehiclesService.getAllVehicles();
        return new ResponseEntity<>(allVehicles, HttpStatus.OK);
    }
    @GetMapping(value = "/vehicles/{id}/taxicos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<VehiclesDTO>> getTaxicosForVehicle(
            @PathVariable(value = "id") Integer id
    ){
        List<VehiclesDTO> vehiclesDTO = vehiclesService.getTaxicosForVehicle(id);
        return new ResponseEntity<>(vehiclesDTO, HttpStatus.OK);
    }
}
