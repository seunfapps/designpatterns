package com.seunfapps.designpatterns.creational.factory;

public class CurrencyFactory {
    public static Currency getInstance(CurrencyType currency){
        switch (currency){
            case USD:
                return new Dollar();
            case EUR:
                return new Euro();
            case NGN:
                return new Naira();
            default:
                return null;
        }
    }
}
