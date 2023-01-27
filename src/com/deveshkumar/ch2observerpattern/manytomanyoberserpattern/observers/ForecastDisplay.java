package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers;

import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.ISubject;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.StocksPortfolioProfitData;
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
    private double currentProfit = 0.0;
    private double lastProfit;

    public ForecastDisplay() {
    }

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(ISubject subject) {
        if (subject instanceof WeatherData) {
            updateWeatherData((WeatherData) subject);
        } else if (subject instanceof StocksPortfolioProfitData) {
            updateProfitData((StocksPortfolioProfitData) subject);
        }
        display(subject);
    }

    private void updateWeatherData(WeatherData weatherData) {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure(); // only fetching pressure data/state
    }

    private void updateProfitData(StocksPortfolioProfitData stocksPortfolioProfitData) {
        lastProfit = currentProfit;
        currentProfit = stocksPortfolioProfitData.getProfit();
    }

    @Override
    public void display(ISubject subject) {
        if (subject instanceof WeatherData) {
            displayWeatherData();
        } else if (subject instanceof StocksPortfolioProfitData) {
            displayProfitData();
        }
    }

    private void displayWeatherData() {
        System.out.print("Forecast: ");
        if (lastPressure < currentPressure) {
            System.out.println("Improving weather on the way!");
        } else if (lastPressure == currentPressure) {
            System.out.println("More of the same");
        } else {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    private void displayProfitData() {
        System.out.print("Profit forecast: ");
        if (lastProfit < currentProfit) {
            System.out.println("Gaining lots of profit on the way!");
        } else if (lastProfit == currentProfit) {
            System.out.println("Market is constant");
        } else {
            System.out.println("Going in the loss, Recession:(");
        }
    }
}
