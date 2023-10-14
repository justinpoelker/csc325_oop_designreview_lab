/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Justin Poelker
 */
public class Student extends Human {

    //Declare variables
    private double GPA;
    protected int credits;
    protected boolean passing = true;

    //Pass the setter and getters
    public boolean isPassing() {

        return passing;
    }
    public void setPassing(boolean passing) {

        this.passing = passing;
    }

    //Credit the setter and getter
    public int getCredits() {

        return credits;
    }
    public void setCredits(int credits) {

        this.credits = credits;
    }

    //Student super constructor
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }


    //GPA getter and setter
    public double getGPA() {

        return GPA;
    }
    public void setGPA(double GPA) {

        this.GPA = GPA;
    }


    //Override address, changed private string to protected
    @Override
    public String getAddress() {

        return address;
    }
    @Override
    public void setAddress(String address) {

        this.address = address;
    }


}

