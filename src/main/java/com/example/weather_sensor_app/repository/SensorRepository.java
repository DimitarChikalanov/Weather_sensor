package com.example.weather_sensor_app.repository;

import com.example.weather_sensor_app.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor,Long> {
}
