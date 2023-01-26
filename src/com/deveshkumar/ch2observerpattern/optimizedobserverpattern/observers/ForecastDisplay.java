package com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers;

import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects.ISubject;
import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects.WeatherData;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 01:18 pm
 */
public class ForecastDisplay implements IObserver, IDisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure(); // only fetching pressure data/state
        // note: weatherData must be initialized(or set) in the observer
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if(lastPressure < currentPressure) {
            System.out.println("Improving weather on the way!");
        } else if (lastPressure == currentPressure) {
            System.out.println("More of the same");
        } else {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void setSubject(ISubject subject) {
        this.weatherData = (WeatherData) subject;
    }
}
