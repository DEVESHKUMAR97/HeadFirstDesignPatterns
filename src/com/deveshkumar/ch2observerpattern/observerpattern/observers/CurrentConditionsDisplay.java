package com.deveshkumar.ch2observerpattern.observerpattern.observers;

import com.deveshkumar.ch2observerpattern.observerpattern.subjects.WeatherData;

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
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees, " + humidity + "% humidity and " +
                pressure + "atm");
    }
}
