package com.example.weather_sensor_app.entity;

import javax.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "data")
    private String data;

    @Column(name = "located")
    private String located;

    @Column(name = "temperature")
    private double temperature;

    @Column(name = "air_humidity")
    private double air_humidity;

    public Sensor() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocated() {
        return located;
    }

    public void setLocated(String located) {
        this.located = located;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getAir_humidity() {
        return air_humidity;
    }

    public void setAir_humidity(double air_humidity) {
        this.air_humidity = air_humidity;
    }
}
