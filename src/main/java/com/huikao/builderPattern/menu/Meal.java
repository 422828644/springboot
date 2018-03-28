package com.huikao.builderPattern.menu;

import com.huikao.builderPattern.base.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/3/6.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("套餐名 : " + item.name());
            System.out.println(", 打包 : " + item.packing().pack());
            System.out.println(", 单价 : " + item.price());
        }
    }
}
