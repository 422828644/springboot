package com.huikao.builderPattern.menu;

/**
 * Created by admin on 2018/3/6.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
