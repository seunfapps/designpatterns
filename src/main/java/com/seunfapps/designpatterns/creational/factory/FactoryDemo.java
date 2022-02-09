package com.seunfapps.designpatterns.creational.factory;

public class FactoryDemo {
    public static void main (String [] args){
        Currency currency1 = CurrencyFactory.getInstance(CurrencyType.NGN);
        currency1.spend();

        Currency currency2 = CurrencyFactory.getInstance(CurrencyType.USD);
        currency2.spend();

        Currency currency3 = CurrencyFactory.getInstance(CurrencyType.EUR);
        currency3.spend();
    }
}
