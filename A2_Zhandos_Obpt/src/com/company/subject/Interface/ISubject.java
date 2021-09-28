package com.company.subject.Interface;

import com.company.observer.Observer;

public interface ISubject {
    public String addObserver(Observer observer);
    public String removeObserver(Observer observer);
    public void notifyAllO();
}
