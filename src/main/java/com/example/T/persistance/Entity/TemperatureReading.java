package com.example.T.persistance.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "temperature_readings")
public class TemperatureReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double temperature;
    private LocalDateTime readingTime;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    public TemperatureReading() {
    }


    public TemperatureReading(double temperature, LocalDateTime readingTime, Device device) {
        this.temperature = temperature;
        this.readingTime = readingTime;
        this.device = device;
    }


}