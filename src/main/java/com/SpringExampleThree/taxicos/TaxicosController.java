package com.SpringExampleThree.taxicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class TaxicosController {

    @Autowired
    TaxicosService taxicosService;

    @GetMapping(value = "/taxicos", produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<Taxicos> getTaxicos(){
        return taxicosService.getTaxicos();
    }
}
