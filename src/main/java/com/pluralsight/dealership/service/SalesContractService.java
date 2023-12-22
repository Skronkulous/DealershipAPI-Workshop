package com.pluralsight.dealership.service;

import com.pluralsight.dealership.dao.SalesContractDAO;
import com.pluralsight.dealership.model.contract.LeaseContract;
import com.pluralsight.dealership.model.contract.SalesContract;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesContractService {

    private final SalesContractDAO salesContractDAO;


    public SalesContractService(SalesContractDAO salesContractDAO) {
        this.salesContractDAO = salesContractDAO;
    }

    public List<SalesContract> allSalesContracts(){
        return salesContractDAO.getAllSalesContracts();
    }

    public SalesContract byIDService(int id){
        return salesContractDAO.byID(id);
    }
}
