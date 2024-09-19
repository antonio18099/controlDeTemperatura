package com.example.T.domain.Service;


import com.example.T.persistance.Entity.TemperatureReading;

import java.util.List;

public interface TemperatureReadingService {
    TemperatureReading createTemperatureReading(TemperatureReading temperatureReading);
    TemperatureReading getTemperatureReadingById(Long id);
    List<TemperatureReading> getAllTemperatureReadings();
    TemperatureReading updateTemperatureReading(TemperatureReading temperatureReading);
    void deleteTemperatureReading(Long id);
}