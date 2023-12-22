package com.pluralsight.dealership.controller;

import com.pluralsight.dealership.model.Vehicle;
import com.pluralsight.dealership.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping(path="/vehicle/vin/{vin}")
    public List<Vehicle> getVehicleByVIN(@PathVariable String vin){
        return vehicleService.byVINService(vin);
    }

    @GetMapping(path="/vehicle/price/{lowest}/{highest}")
    public List<Vehicle> getVehicleByPrice(@PathVariable double lowest, @PathVariable double highest){
        return vehicleService.byPriceService(lowest, highest);
    }

    @GetMapping(path="/vehicle/makemodel/{make}/{model}")
    public List<Vehicle> getVehicleByMakeModel(@PathVariable String make, @PathVariable String model){
        return vehicleService.byMakeModelService(make, model);
    }

    @GetMapping(path="/vehicle/year/{lowest}/{highest}")
    public List<Vehicle> getVehicleByYear(@PathVariable int lowest, @PathVariable int highest){
        return vehicleService.byYearService(lowest, highest);
    }

    @GetMapping(path="/vehicle/color/{color}")
    public List<Vehicle> getVehicleByColor(@PathVariable String color){
        return vehicleService.byColorService(color);
    }

    @GetMapping(path="/vehicle/mileage/{lowest}/{highest}")
    public List<Vehicle> getVehicleByMileage(@PathVariable int lowest, @PathVariable int highest){
        return vehicleService.byMileageService(lowest, highest);
    }

    @GetMapping(path="/vehicle/type/{type}")
    public List<Vehicle> getVehicleByType(@PathVariable String type){
        return vehicleService.byTypeService(type);
    }

    @GetMapping(path="/vehicle/all")
    public List<Vehicle> getAllVehicle(){
        return vehicleService.allVehiclesService();
    }
}
