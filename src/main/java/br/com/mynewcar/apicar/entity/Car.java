package br.com.mynewcar.apicar.entity;

import br.com.mynewcar.apicar.enuns.CarColor;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@lombok.Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private static final long serialVersionVID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private  String nameModel;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date year;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CarColor color;


    public Car(String brand, String nameModel, Date year, CarColor color) {
        this.brand = brand;
        this.nameModel = nameModel;
        this.year = year;
        this.color = color;
    }
}
