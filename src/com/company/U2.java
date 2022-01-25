package com.company;

public class U2 extends Rocket{
//    Rocket cost = $120 Million
//    Rocket weight = 18 Tonnes
//    Max weight (with cargo) = 29 Tonnes
//    Chance of launch explosion = 4% * (cargo carried / cargo limit)
//    Chance of landing crash = 8% * (cargo carried / cargo limit)

    public U2() {
        super(120, 18_000, 29_000);
    }

    public boolean launch(){
        double chanseOfLaunch = Math.random();
        return chanseOfLaunch > 0.04 * ((double) getCargoWeight()/(double) (getMaxWeight()- getRocketWeight()));
    }

    public boolean land(){
        double chanseOfLaunch = Math.random();
        return chanseOfLaunch > 0.08 * ((double) getCargoWeight()/(double) (getMaxWeight()- getRocketWeight()));
    }

}