package com.leayw.patterns.behavior.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> list;

    public ShoppingCart() {
        list = new ArrayList<>();
    }

    public void addItem(Item item) {
        list.add(item);
    }

    public void removeItem(Item item) {
        list.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : list) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy strategy) {
        int amount = calculateTotal();
        strategy.pay(amount);
    }
}
