package com.deveshkumar.ch2observerpattern.optimizedobserverpattern;

import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers.CurrentConditionsDisplay;
import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers.ForecastDisplay;
import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers.HeatIndexDisplay;
import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers.StatisticsDisplay;
import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects.WeatherData;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 01:07 am
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // adding observers to the subject list
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // weather station changing states of subject, which notifies and displays
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();

        // removing observer from the subject
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
        System.out.println();

        // adding heatIndex observer to the subject list, via application
        // note this time using constructor to register. So, headIndex observer does not contain subject reference
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();
        weatherData.registerObserver(heatIndexDisplay);
        weatherData.setMeasurements(64, 92, 28.0f);
        System.out.println();


        // removing observer from the subject
        weatherData.removeObserver(heatIndexDisplay);
        weatherData.setMeasurements(60, 90, 28.5f);
        System.out.println();

    }
}
