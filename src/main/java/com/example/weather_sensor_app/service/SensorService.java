package com.example.weather_sensor_app.service;

import com.example.weather_sensor_app.entity.Sensor;

import java.util.List;

public interface SensorService {

    Sensor addData(Sensor sensor);

    List getAllDataInSensor();

    void removeData(Sensor sensor);


}
