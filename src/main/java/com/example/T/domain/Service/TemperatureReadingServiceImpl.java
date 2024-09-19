package com.example.T.domain.Service;


import com.example.T.domain.Repository.TemperatureReadingRepository;
import com.example.T.persistance.Entity.TemperatureReading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureReadingServiceImpl implements TemperatureReadingService {

    private final TemperatureReadingRepository temperatureReadingRepository;

    @Autowired
    public TemperatureReadingServiceImpl(TemperatureReadingRepository temperatureReadingRepository) {
        this.temperatureReadingRepository = temperatureReadingRepository;
    }

    @Override
    public TemperatureReading createTemperatureReading(TemperatureReading temperatureReading) {
        return temperatureReadingRepository.save(temperatureReading);
    }

    @Override
    public TemperatureReading getTemperatureReadingById(Long id) {
        return temperatureReadingRepository.findById(id).orElse(null);
    }

    @Override
    public List<TemperatureReading> getAllTemperatureReadings() {
        return temperatureReadingRepository.findAll();
    }

    @Override
    public TemperatureReading updateTemperatureReading(TemperatureReading temperatureReading) {
        return temperatureReadingRepository.save(temperatureReading);
    }

    @Override
    public void deleteTemperatureReading(Long id) {
        temperatureReadingRepository.deleteById(id);
    }
}