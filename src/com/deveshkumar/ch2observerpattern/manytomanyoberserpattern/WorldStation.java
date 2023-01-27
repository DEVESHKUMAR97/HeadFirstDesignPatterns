package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern;

import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers.CurrentConditionsDisplay;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers.ForecastDisplay;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers.HeatIndexDisplay;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers.StatisticsDisplay;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.StocksPortfolioProfitData;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.WeatherData;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 07:29 pm
 */
public class WorldStation {
    public static void main(String[] args) {
        // creating 2 subjects
        WeatherData weatherData = new WeatherData();
        StocksPortfolioProfitData profitData = new StocksPortfolioProfitData();

        // Creating observers, here we are not adding these observers to the subject list via constructor
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();


        // Adding observers to the weatherData subject, via register method from the application.
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(heatIndexDisplay);

        // weather station changing states of subject, which notifies and displays
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();

        // Adding observers to the profitData subject, via register method from the application.
        profitData.registerObserver(currentConditionsDisplay);
        profitData.registerObserver(forecastDisplay);

        // profit changing of subject, which notifies and displays
        profitData.setMeasurements(80);
        System.out.println();
        profitData.setMeasurements(80);
        System.out.println();
        profitData.setMeasurements(70);
        System.out.println();
        profitData.setMeasurements(90);
        System.out.println();


        // removing forecast observer from the weather subject
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
        System.out.println();


        profitData.setMeasurements(90);
        System.out.println();

        // removing currentConditions observer from the profit subject
        profitData.removeObserver(currentConditionsDisplay);
        profitData.setMeasurements(70);
        System.out.println();

        profitData.registerObserver(currentConditionsDisplay);
        profitData.setMeasurements(5000000);
        System.out.println();

    }
}
