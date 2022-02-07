package com.seunfapps.designpatterns.creational.builder;

public class LunchOrderBuilder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBuilder (){

    }

    //Create a new object by calling constructor of the class and pass the builder object
    public LunchOrder build(){
        return new LunchOrder(this);
    }

    public LunchOrderBuilder bread(String bread){
        this.bread = bread;
        return this;
    }
    public LunchOrderBuilder condiments(String condiments){
        this.condiments = condiments;
        return this;
    }
    public LunchOrderBuilder dressing(String dressing){
        this.dressing = dressing;
        return this;
    }
    public LunchOrderBuilder meat(String meat){
        this.meat = meat;
        return this;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
