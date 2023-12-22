package com.pluralsight.dealership.service;

import com.pluralsight.dealership.dao.LeaseContractDAO;
import com.pluralsight.dealership.model.contract.LeaseContract;
import org.springframework.stereotype.Component;

import java.rmi.dgc.Lease;
import java.util.List;

@Component
public class LeaseContractService {

    private final LeaseContractDAO leaseContractDAO;


    public LeaseContractService(LeaseContractDAO leaseContractDAO) {
        this.leaseContractDAO = leaseContractDAO;
    }

    public List<LeaseContract> allLeaseContracts(){
        return leaseContractDAO.getAllLeaseContracts();
    }

    public LeaseContract byIDService(int id){
        return leaseContractDAO.byID(id);
    }
}
