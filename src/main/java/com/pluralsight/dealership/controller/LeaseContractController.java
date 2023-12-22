package com.pluralsight.dealership.controller;

import com.pluralsight.dealership.model.contract.LeaseContract;
import com.pluralsight.dealership.service.LeaseContractService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeaseContractController {

    private final LeaseContractService leaseContractService;

    public LeaseContractController(LeaseContractService leaseContractService) {
        this.leaseContractService = leaseContractService;
    }

    @GetMapping(path="/lc/{id}")
    public LeaseContract getLeaseContractByID(@PathVariable int id){
        return leaseContractService.byIDService(id);
    }

    @GetMapping(path="ls/all")
    public List<LeaseContract> getAllLeaseContracts(){
        return leaseContractService.allLeaseContracts();
    }
}
