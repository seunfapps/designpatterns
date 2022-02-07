package com.seunfapps.designpatterns.creational.builder;


public class LunchOrderDemo {
    public static void main (String [] args){
        LunchOrderBuilder builder = new LunchOrderBuilder();

        LunchOrder myOrder = builder.bread("Agege")
                                    .condiments("Wasabi")
                                    .dressing("Salad")
                                    .meat("Chicken")
                                    .build();

        System.out.println(myOrder.getBread());
        System.out.println(myOrder.getCondimnents());
        System.out.println(myOrder.getMeat());
    }
}
