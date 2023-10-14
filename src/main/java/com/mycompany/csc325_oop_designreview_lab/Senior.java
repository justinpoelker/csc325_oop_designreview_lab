package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    //Senior constructor
    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if(credits < 85){
            this.setPassing(false);
        }
    }

    //Tostring must override in order to function properly
    @Override
    public String toString() {
        String senior;
        senior = "Name: "+getName() +" Age: "+ getAge() +" Credits: "+ getCredits();
        return senior;
    }


}
