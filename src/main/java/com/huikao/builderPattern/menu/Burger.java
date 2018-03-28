package com.huikao.builderPattern.menu;

import com.huikao.builderPattern.base.Item;
import com.huikao.builderPattern.base.Packing;
import com.huikao.builderPattern.packstyle.Wrapper;

/**
 * Created by admin on 2018/3/6.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
