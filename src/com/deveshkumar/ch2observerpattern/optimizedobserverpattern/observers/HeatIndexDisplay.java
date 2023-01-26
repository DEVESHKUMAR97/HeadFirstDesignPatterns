package com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers;

import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects.ISubject;
import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects.WeatherData;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 01:32 pm
 */
public class HeatIndexDisplay implements IObserver, IDisplayElement {
    private float heatIndex = 0.0f;
    private WeatherData weatherData;

    public HeatIndexDisplay() {
    }

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        // note: weatherData must be initialized(or set) in the observer
        // here we have not initialized the weatherData via constructor.
        // So, we have to set it while adding this observer to the subject list
        heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }


    @Override
    public void setSubject(ISubject subject) {
        this.weatherData = (WeatherData) subject;
    }
}
