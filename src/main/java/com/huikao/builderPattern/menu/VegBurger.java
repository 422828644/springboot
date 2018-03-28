package com.huikao.builderPattern.menu;

/**
 * Created by admin on 2018/3/6.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
