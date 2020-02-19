package com.example.weather_sensor_app.service;

import com.example.weather_sensor_app.entity.Sensor;
import com.example.weather_sensor_app.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SensorServiceImpl implements SensorService {
    @Autowired
    private SensorRepository sensorRepository;

    // Inserts row into table
    @Override
    public Sensor addData(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    // Retrieve all rows from table
    @Override
    public List getAllDataInSensor() {
        List sensorList = new ArrayList<>();
        sensorRepository.findAll().forEach(sensorList::add);
        return sensorList;
    }


    // Removes row from table
    @Override
    public void removeData(Sensor sensor) {
        sensorRepository.delete(sensor);
    }
}
