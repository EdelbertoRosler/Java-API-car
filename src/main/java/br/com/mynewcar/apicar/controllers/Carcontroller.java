package br.com.mynewcar.apicar.controllers;


import br.com.mynewcar.apicar.entity.Car;
import br.com.mynewcar.apicar.exceptions.carNotFoundException;
import br.com.mynewcar.apicar.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/vi/persona")
public class Carcontroller {
    @Autowired
    CarService carService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car criateCar (@RequestBody @Validated Car car){ return carService.postCar(car);}

    @GetMapping
    public List<Car> getCar(){ return carService.getCar();}

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarId (@PathVariable Long id) throws Exception, carNotFoundException {
        return ResponseEntity.ok(carService.getCarId(id).orElseThrow(() ->
            new carNotFoundException("Car whit id " + id + "not found ")));
    }

    @PutMapping("/{id}")
    public Object putCar (@PathVariable Long id, @RequestBody Car car) throws carNotFoundException {
        try { return carService.putCar(car); }
        catch (Exception ex) { System.out.println(ex.getMessage()); }
        return ("Car whit id " + id + "not found ");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Car> deleteCar (@PathVariable Long id) throws carNotFoundException {
        try { carService.deleteCar(id); }
        catch (Exception ex) { System.out.println(ex.getMessage()); }
        return ResponseEntity.ok().build();
    }

}
