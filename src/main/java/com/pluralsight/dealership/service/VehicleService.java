package com.pluralsight.dealership.service;

import com.pluralsight.dealership.dao.VehicleDAO;
import org.springframework.stereotype.Component;
import com.pluralsight.dealership.model.Vehicle;

import java.util.List;

@Component
public class VehicleService {

    private final VehicleDAO vehicleDAO;

    public VehicleService(VehicleDAO vehicleDAO) {
        this.vehicleDAO = vehicleDAO;
    }

    public List<Vehicle> byVINService(String vin){
        return vehicleDAO.byVIN(vin);
    }

    public List<Vehicle> byPriceService(double lowest, double highest) {
        return vehicleDAO.byPrice(lowest, highest);
    }

    public List<Vehicle> byMakeModelService(String make, String model) {
        return vehicleDAO.byMakeModel(make, model);
    }

    public List<Vehicle> byYearService(int lowest, int highest) {
        return vehicleDAO.byYear(lowest, highest);
    }

    public List<Vehicle> byColorService(String color) {
        return vehicleDAO.byColor(color);
    }

    public List<Vehicle> byMileageService(int lowest, int highest) {
        return vehicleDAO.byMileage(lowest, highest);
    }

    public List<Vehicle> byTypeService(String type) {
        return vehicleDAO.byType(type);
    }

    public List<Vehicle> allVehiclesService() {
        return vehicleDAO.allVehicles();
    }
}
