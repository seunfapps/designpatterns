package com.seunfapps.designpatterns.creational.singleton;

public class MySingletonDemo {
    public static void main (String [] args){
        MySingleton  instance = MySingleton.getInstance();
        System.out.println(instance);
        MySingleton anotherInstance = MySingleton.getInstance();
        //should print same object address
        System.out.println(anotherInstance);
    }
}
