package com.huikao.builderPattern.packstyle;

import com.huikao.builderPattern.base.Packing;

/**
 * Created by admin on 2018/3/6.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "纸杯";
    }
}
