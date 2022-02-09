package com.seunfapps.designpatterns.creational.factory;

public class Naira implements Currency {
    @Override
    public void spend() {
        System.out.println("Spending naira");
    }
}
