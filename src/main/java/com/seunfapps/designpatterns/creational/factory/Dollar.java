package com.seunfapps.designpatterns.creational.factory;

public class Dollar implements Currency {
    @Override
    public void spend() {
        System.out.println("Spending dollar");
    }
}
