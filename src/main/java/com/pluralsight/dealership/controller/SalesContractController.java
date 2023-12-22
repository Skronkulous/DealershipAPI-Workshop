package com.pluralsight.dealership.controller;

import com.pluralsight.dealership.model.contract.LeaseContract;
import com.pluralsight.dealership.model.contract.SalesContract;
import com.pluralsight.dealership.service.SalesContractService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class SalesContractController {

    private final SalesContractService salesContractService;


    public SalesContractController(SalesContractService salesContractService) {
        this.salesContractService = salesContractService;
    }


    @GetMapping(path="/sc/{id}")
    public SalesContract getSalesContractByID(@PathVariable int id){
        return salesContractService.byIDService(id);
    }

    @GetMapping(path="ls/all")
    public List<SalesContract> getAllSalesContracts(){
        return salesContractService.allSalesContracts();
    }
}
