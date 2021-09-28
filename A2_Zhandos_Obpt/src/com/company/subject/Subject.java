package com.company.subject;

import com.company.observer.Observer;
import com.company.subject.Interface.ISubject;

import java.util.ArrayList;

public class Subject implements ISubject {
    ArrayList<Observer> observers = new ArrayList<>();
    ArrayList<String> news = new ArrayList<>();

    @Override
    public String addObserver(Observer observer) {
        observers.add(observer);
        return "New observer was added!";
    }
    @Override
    public String removeObserver(Observer observer) {
        observers.remove(observer);
        return observer+" was removed";
    }

    @Override
    public void notifyAllO() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
    public void addTitle(String vacancy){
        this.news.add(vacancy);
        notifyAllO();
    }


}
