package com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.observers;

import com.deveshkumar.ch2observerpattern.manytomanyoberserpattern.subjects.ISubject;


/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 26-01-2023
 * @time : 12:05 am
 */

/**
 * A class can implement the {@code Observer} interface when it
 * wants to be informed of changes in observable/subject objects.
 */
public interface IObserver {
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an {@code Observable} object's
     * {@code notifyObservers} method to have all the object's
     * observers notified of the change.
     */
    public void update();

    /**
     * This method is called to set subject in the observer
     * while adding this observer to a subject list.
     * @param subject
     */
    public void setSubject(ISubject subject);
}
