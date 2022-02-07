package com.seunfapps.designpatterns.creational.builder;

public class LunchOrder {
    private final String bread;
    private final String condimnents;
    private final String dressing;
    private final String meat;

    public LunchOrder(LunchOrderBuilder builder){
        this.bread =  builder.getBread();
        this.condimnents = builder.getCondiments();
        this.dressing = builder.getDressing();
        this.meat = builder.getMeat();
    }

    public String getBread() {
        return bread;
    }

    public String getCondimnents() {
        return condimnents;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
