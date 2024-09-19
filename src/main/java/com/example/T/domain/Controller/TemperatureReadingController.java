package com.example.T.domain.Controller;


import com.example.T.domain.Service.TemperatureReadingService;
import com.example.T.persistance.Entity.TemperatureReading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/temperature-readings")
public class TemperatureReadingController {

    private final TemperatureReadingService temperatureReadingService;

    @Autowired
    public TemperatureReadingController(TemperatureReadingService temperatureReadingService) {
        this.temperatureReadingService = temperatureReadingService;
    }

    @GetMapping
    public ResponseEntity<List<TemperatureReading>> getAllTemperatureReadings() {
        List<TemperatureReading> readings = temperatureReadingService.getAllTemperatureReadings();
        return ResponseEntity.ok(readings);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TemperatureReading> getTemperatureReadingById(@PathVariable Long id) {
        TemperatureReading reading = temperatureReadingService.getTemperatureReadingById(id);
        return reading != null ? ResponseEntity.ok(reading) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<TemperatureReading> createTemperatureReading(@RequestBody TemperatureReading temperatureReading) {
        TemperatureReading createdReading = temperatureReadingService.createTemperatureReading(temperatureReading);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReading);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TemperatureReading> updateTemperatureReading(@PathVariable Long id, @RequestBody TemperatureReading temperatureReading) {
        temperatureReading.setId(id); // Asegúrate de que el ID se establezca en el objeto
        TemperatureReading updatedReading = temperatureReadingService.updateTemperatureReading(temperatureReading);
        return ResponseEntity.ok(updatedReading);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTemperatureReading(@PathVariable Long id) {
        temperatureReadingService.deleteTemperatureReading(id);
        return ResponseEntity.noContent().build();
    }
}