package com.company;

import java.util.ArrayList;

public class Rocket implements SpaceShip{

    private int cost;
    private int rocketWeight;
    private int maxWeight;
    private ArrayList<Item> items;
    private Item item;

    public Rocket(int cost, int rocketWeight, int maxWeight) {
        items = new ArrayList<>();
        this.cost = cost;
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return (getCargoWeight() + item.getWeight()) <= (maxWeight - rocketWeight);
    }

    @Override
    public void carry(Item item) {
        items.add(item);
    }

    public int getCargoWeight() {
        int cargoWeight = 0;
        for (Item item : items) {
            cargoWeight += item.getWeight();
        }
        return cargoWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCost() {
        return cost;
    }

    public int getRocketWeight() {
        return rocketWeight;
    }
}











