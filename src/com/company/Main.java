package com.company;


import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Simulation simulation = new Simulation();
//        ArrayList<Item> itemsPhase1 = simulation.loadItems("phase-1.txt");
//        ArrayList<Item> itemsPhase2 = simulation.loadItems("phase-2.txt");

        ArrayList<Rocket> u1RocketsPhase1 = simulation.loadU1(simulation.loadItems("phase-1.txt"));
        ArrayList<Rocket> u1RocketsPhase2 = simulation.loadU1(simulation.loadItems("phase-2.txt"));
        ArrayList<Rocket> u2RocketsPhase1 = simulation.loadU2(simulation.loadItems("phase-1.txt"));
        ArrayList<Rocket> u2RocketsPhase2 = simulation.loadU2(simulation.loadItems("phase-2.txt"));

        System.out.println("U1");
        System.out.println("phase 1: " + simulation.runSimualtion(u1RocketsPhase1));
        System.out.println("phase 2: " + simulation.runSimualtion(u1RocketsPhase2));
        System.out.println("U2");
        System.out.println("phase 1: " + simulation.runSimualtion(u2RocketsPhase1));
        System.out.println("phase 2: " + simulation.runSimualtion(u2RocketsPhase2));

    }
}
