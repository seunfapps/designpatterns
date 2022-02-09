package com.seunfapps.designpatterns.creational.factory;

public class Euro implements Currency {
    @Override
    public void spend() {
        System.out.println("Spending euro");
    }
}
