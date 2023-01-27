package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers;

import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.ISubject;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.WeatherData;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 01:32 pm
 */
public class HeatIndexDisplay implements IObserver, IDisplayElement {
    private float heatIndex = 0.0f;
    public HeatIndexDisplay() {
    }

    public HeatIndexDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(ISubject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
        }
        display(subject);
    }

    @Override
    public void display(ISubject subject) {
        if (subject instanceof WeatherData) {
            System.out.println("Heat index is " + heatIndex);
        }
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
}
