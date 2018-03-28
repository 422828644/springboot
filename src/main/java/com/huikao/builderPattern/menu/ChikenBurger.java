package com.huikao.builderPattern.menu;

/**
 * Created by admin on 2018/3/6.
 */
public class ChikenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
