package org.example.ObserverPattern.Subject;


import org.example.ObserverPattern.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
