package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 12:50 am
 */

/**
 * A class can implement the {@code DisplayElement} interface when it
 * wants to be displayed of changes in observable/subject objects.
 */
public interface IDisplayElement {
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an {@code Observable} object's
     * {@code notifyObservers} method to have all the object's
     * observers notified of the change followed by the display of change.
     */
    public void display();
}
