package com.company.observer;

import com.company.observer.Intrface.IObserver;

import java.util.ArrayList;

public class Observer implements IObserver {
   private String name;

    public Observer(String name) {
        this.name=name;
    }

    @Override
    public void update(ArrayList<String> news) {
        System.out.println("Dear "+name+"\n"+"New updates are here!"+"\n"+news);
    }

}
