package com.company;

public class U1 extends Rocket{
//    Rocket cost = $100 Million
//    Rocket weight = 10 Tonnes
//    Max weight (with cargo) = 18 Tonnes
//    Chance of launch explosion = 5% * (cargo carried / cargo limit)
//    Chance of landing crash = 1% * (cargo carried / cargo limit)

    public U1() {
        super(100, 10_000, 18_000);
    }

    public boolean launch(){
        double chanseOfLaunch = Math.random();
        return chanseOfLaunch > 0.05 * ((double) getCargoWeight()/(double) (getMaxWeight()- getRocketWeight()));
    }

    public boolean land(){
        double chanseOfLaunch = Math.random();
        return chanseOfLaunch > 0.01 * ((double) getCargoWeight()/(double) (getMaxWeight()- getRocketWeight()));
    }

}
