package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers;

import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.ISubject;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.WeatherData;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 12:55 am
 */
public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        // note: weatherData must be initialized(or set) in the observer
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees, " + humidity + "% humidity and " +
                pressure + "atm");
    }

    @Override
    public void setSubject(ISubject subject) {
        this.weatherData = (WeatherData) subject;
    }
}
