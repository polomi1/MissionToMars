package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(String filename) throws FileNotFoundException {

        File file = new File(filename);
        ArrayList<Item> items = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String[] itemWeight = scanner.nextLine().split("=");
            items.add(new Item(itemWeight[0], Integer.parseInt(itemWeight[1])));
        }
        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items){
        ArrayList<Rocket> rockets = new ArrayList<>();

        while(items.size()>0){
            U1 u1 = new U1();

            for (int i = items.size()-1; i >= 0; i--) {
                if(u1.canCarry(items.get(i))){
                    u1.carry(items.get(i));
                    items.remove(i);
                }
            }
            rockets.add(u1);
        }
        return rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items){
        ArrayList<Rocket> rockets = new ArrayList<>();

        while(items.size()>0){
            U2 u2 = new U2();

            for (int i = items.size()-1; i >= 0; i--) {
                if(u2.canCarry(items.get(i))){
                    u2.carry(items.get(i));
                    items.remove(i);
                }
            }
            rockets.add(u2);
        }
        return rockets;
    }

    public int runSimualtion(ArrayList<Rocket> rockets){
        int totalStarts = 0;
        for (Rocket rocket : rockets) {
            boolean succes = false;
            while (!succes) {
                totalStarts += 1;
                if (rocket.land() && rocket.launch()) {
                    succes = true;
                }
            }
        }
        return totalStarts * rockets.get(0).getCost() *1_000_000;
    }
}

