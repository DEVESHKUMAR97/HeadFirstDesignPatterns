package com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects;

import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 12:31 am
 */
public class WeatherData implements ISubject {
    private List<IObserver> observers; // ArrayList to hold the observers
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<IObserver>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }

    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * This method is getting called from WeatherStation(Application)
     * but for testing purpose, we will be calling this from setMeasurements method
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
