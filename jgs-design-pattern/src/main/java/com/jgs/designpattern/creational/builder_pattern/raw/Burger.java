package com.jgs.designpattern.creational.builder_pattern.raw;

/**
 * Created by Administrator on 2018/06/22 10:52.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
