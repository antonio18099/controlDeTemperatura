package com.example.T.domain.Repository;

import com.example.T.persistance.Entity.TemperatureReading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureReadingRepository extends JpaRepository<TemperatureReading, Long> {
}
