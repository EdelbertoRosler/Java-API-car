package br.com.mynewcar.apicar.repositories;

import br.com.mynewcar.apicar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICarRepository extends JpaRepository<Car, Long> {

}
