package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects;

import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 06:42 pm
 */
public class StocksPortfolioProfitData implements ISubject {
    private List<IObserver> observers;
    private double profit = 0.0;

    public StocksPortfolioProfitData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        if(!observers.contains(observer)) {
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
            observer.update(this);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double profit) {
        this.profit = profit;
        measurementsChanged();
    }

    public double getProfit() {
        return profit;
    }
}
