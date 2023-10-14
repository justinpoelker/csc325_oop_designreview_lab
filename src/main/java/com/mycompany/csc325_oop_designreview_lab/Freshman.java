package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{

    //Freshman constructor
    public Freshman(String name, short age, int credits) {

        super(name, age, credits);
    }

    //Tostring must override in order to function properly
    @Override
    public String toString() {
        String freshman;
        freshman = "Name: "+getName() +" Age: "+ getAge() +" Credits: "+ getCredits();
        return freshman;
    }

}
