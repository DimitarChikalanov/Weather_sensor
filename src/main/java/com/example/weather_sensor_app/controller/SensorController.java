package com.example.weather_sensor_app.controller;

import com.example.weather_sensor_app.entity.Sensor;
import com.example.weather_sensor_app.repository.SensorRepository;
import com.example.weather_sensor_app.service.SensorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/sensor/api")
public class SensorController {
    @Autowired
    private SensorServiceImpl sensorService;
    private SensorRepository sensorRepository;

    @PostMapping("/save")
    public Sensor saveData(@Valid @RequestBody Sensor sensor) {
        return sensorService.addData(sensor);
    }

    @GetMapping("/all")
    public List<Sensor> getAllDAta() {
        return sensorService.getAllDataInSensor();
    }

    @DeleteMapping("/deleted/{Id}")
    public ResponseEntity<?> deleteSensorData(@PathVariable(value = "id") long id) {
        Sensor sensor = sensorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("id not countain" + id));
        sensorService.removeData(sensor);
        return ResponseEntity.ok().build();
    }

}
