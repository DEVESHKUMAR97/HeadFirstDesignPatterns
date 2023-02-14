package com.deveshkumar.ch5singletondesignpattern.b1chocolatecompany;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 14-02-2023
 * @time : 05:42 pm
 */
public class ChocolateController {
    public static void main(String[] args) {
        // using company's chocolate boiler to prepare chocolate
        // and there is only one chocolate boiler present in the company
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getChocolateBoiler();
        chocolateBoiler.fill();
        chocolateBoiler.boil();


        // This should return the same chocolate boiler,
        // and we should not be able to fill the boiler again since the boiler is previously already filled and boiled
        chocolateBoiler = ChocolateBoiler.getChocolateBoiler();
        chocolateBoiler.fill(); // should not be able to fill it again
    }
}


/*
Output 1: Wrong output when not using Single pattern, then it will create multiple instances
In this case without draining we are again able to fill the  boiler
===
Filling the boiler
Boiling...
Filling the boiler
===


Output 2: Correct output, when using Singleton pattern, then it will create only one instance of Boiler
In this case we are not able to fill boiler again since it is  already filled.
===
Filling the boiler
Boiling...
Can't fill since boiler is already filled.
===

 */
