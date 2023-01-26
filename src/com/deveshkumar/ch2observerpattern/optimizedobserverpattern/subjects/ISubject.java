package com.deveshkumar.ch2observerpattern.optimizedobserverpattern.subjects;

import com.deveshkumar.ch2observerpattern.optimizedobserverpattern.observers.IObserver; /**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 25-01-2023
 * @time : 11:46 pm
 */

/**
 * A concrete observable/Subject can implement this interface to represent an object
 * that the application wants to have observed.
 * <p>
 * An observable object can have one or more observers.
 * An observer may be any object that implements interface Observer. After an observable instance
 * changes, an application calling the Observable's notifyObservers method causes all of its
 * observers to be notified of the change by a call to their update method.
 * <p>
 * The order in which notifications will be delivered is unspecified,
 * but subclasses can use any order, use no guaranteed order, deliver notifications on separate threads.
 * When an observable object is newly created, its list of observers is empty.
 */
public interface ISubject {
    /**
     * Adds an observer to the list of observers for this subject, provided
     * that it is not the same as some observer already in the list.
     * <p>
     * This method is getting called from the concrete observer who wants to register
     * or this can also be called from the application.
     * @param   observer   an observer to be added.
     * @throws NullPointerException   if the parameter o is null.
     */
    public void registerObserver(IObserver observer);

    /**
     * Deletes an observer from the list of observers of this subject.
     * Passing {@code null} to this method will have no effect.
     * <p>
     * This method is getting called from the concrete observer who wants to un-register
     * or this can also be called from the application.
     * @param   observer   the observer to be deleted.
     */
    public void removeObserver(IObserver observer);

    /**
     * If this object has changed then notify all of its observers
     * <p>
     * Each observer has its {@code update} method called to get the notification.
     * <p>
     * This method is getting called from the Application.
     */
    public void notifyObservers();

}
