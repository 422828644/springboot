package com.huikao.builderPattern.menu;

import com.huikao.builderPattern.packstyle.Bottle;
import com.huikao.builderPattern.base.Item;
import com.huikao.builderPattern.base.Packing;

/**
 * Created by admin on 2018/3/6.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
