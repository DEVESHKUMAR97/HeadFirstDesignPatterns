package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers;

import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.ISubject;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.WeatherData;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 01:18 pm
 */
public class ForecastDisplay implements IObserver, IDisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(ISubject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure(); // only fetching pressure data/state
            display();
        }
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
}
