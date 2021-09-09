package br.com.mynewcar.apicar.services;

import br.com.mynewcar.apicar.entity.Car;
import br.com.mynewcar.apicar.repositories.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    ICarRepository iCarRepository;

    @Autowired
    public CarService(ICarRepository carRepository) {
        this.iCarRepository = iCarRepository;
    }

    public Car postCar(Car car) { return iCarRepository.save(car); }

    public List<Car> getCar() { return iCarRepository.findAll(); }

    public Optional<Car> getCarId(Long id) { return iCarRepository.findById(id);}

    public Object putCar(Car car) { return iCarRepository.save(car); }

    public void deleteCar(Long id) { iCarRepository.deleteById(id); }
}

