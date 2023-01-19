package com.bridgelabz.gambling;

public class GamblingSimulationProblem {
    //Default Constructor
    public GamblingSimulationProblem() {
        System.out.println("Welcome to Gambling Simulation Program");
        System.out.println();
        System.out.println("Gambler starts the game...");
    }

    //Declaring constants
    final int betMoney = 1;
    final int stakePerDay = 100;

    public static void main(String[] args) {

        //Initialize the object.
        GamblingSimulationProblem gambling = new GamblingSimulationProblem();
        System.out.println();

        //Declaring variables
        int stake = 0;
        stake = stake + gambling.stakePerDay;
        System.out.println("Initial stake of Gambler is : "+gambling.stakePerDay);
        System.out.println("Initial betting money in gambling is : "+gambling.betMoney);

        System.out.println("stake="+stake);
    }
}
