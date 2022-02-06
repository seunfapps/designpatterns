package com.seunfapps.designpatterns.creational.singleton;

public class MySingleton {
    private static MySingleton instance = null;

    /*A singleton has a private constructor that only it has access to,
    hence the singleton is in charge of how its instance is created
    no other class can new-up an instance */
    private MySingleton (){
    }

    //A method that returns the instance.
    public static MySingleton getInstance() {
        if(instance == null)
            instance =  new MySingleton();

        return instance;
    }
}
