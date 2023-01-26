package com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers;

import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects.ISubject;
import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects.WeatherData;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 01:03 pm
 */
public class StatisticsDisplay implements IObserver, IDisplayElement {
    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum = 0.0f;
    private int numReadings = 0;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        // note: weatherData must be initialized(or set) in the observer
        float temperature = weatherData.getTemperature(); // only fetching temperature data

        // this observer only using temperature, but subject is giving all 3 parameters.
        // This shows that the subject doesn't know or care about, how observer is using these parameters.
        if(temperature > maxTemperature) maxTemperature = temperature;
        if(temperature < minTemperature) minTemperature = temperature;
        temperatureSum += temperature;
        numReadings += 1;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " +
                temperatureSum / numReadings + "/" +
                maxTemperature + "/" +
                minTemperature);
    }

    @Override
    public void setSubject(ISubject subject) {
        this.weatherData = (WeatherData) subject;
    }
}
