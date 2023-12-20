package com.example.termproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "car")
public class CarEntity {

	@Id
    @Column(name = "id")
    private Long id;

    @Column(name = "id2")
    private String id2;

    @Column(name = "companyname")
    private String companyName;

    @Column(name = "carname")
    private String carName;

    @Column(name = "price")
    private String price;

    @Column(name = "img")
    private String img;

    @Column(name = "fuel")
    private String fuel;

    @Column(name = "fuelEfficiency")
    private String fuelEfficiency;

    // Getters and setters
}
//INSERT INTO `Car` (`id`, `id2`, `companyName`, `carName`, `price`, `img`, `fuel`, `fuel_efficiency`) VALUES