package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers;

import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.ISubject;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.StocksPortfolioProfitData;
import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.WeatherData;

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
    private double profit; // 2nd subject data

    public CurrentConditionsDisplay() {
    }

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(ISubject subject) {
        if(subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
        } else if(subject instanceof StocksPortfolioProfitData) {
            StocksPortfolioProfitData stocksPortfolioProfitData = (StocksPortfolioProfitData) subject;
            this.profit = stocksPortfolioProfitData.getProfit();
        }
        display(subject);
    }

    @Override
    public void display(ISubject subject) {
        if (subject instanceof WeatherData) {
            System.out.println("Current conditions: " + temperature +
                    "F degrees, " + humidity + "% humidity and " +
                    pressure + "atm");
        } else if (subject instanceof StocksPortfolioProfitData) {
            System.out.println("Current Profit: " + profit);
        }
    }
}
