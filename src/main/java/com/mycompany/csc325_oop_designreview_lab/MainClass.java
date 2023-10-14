/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author Justin Poelker
 */
public class MainClass {

 public static void main(String[] args) {


	 	//Create new students
		Student std1= new Freshman("James", (short) 20, 12); // name, age, credits
	 	Student std2 = new Senior("John", (short) 30, 90);

		 //Read input for scanner
	 	Scanner scanner = new Scanner(System.in);
	 	System.out.println("Enter GPA: ");
	 	double gpaNEW = scanner.nextDouble();
	 	std1.setGPA(gpaNEW);
	 	System.out.println(std1.getName() + " has a GPA of "+std1.getGPA());

		//Generate tostring elements
	 	System.out.println(std1.toString());
	 	System.out.println(std2.toString());

		//Output for student credit requirement
		if(std2.passing){
		 	System.out.println(std2.getName() +" is passing");
	 	}
		else {
		 System.out.println(std2.getName() +" is NOT passing");
	 }

	}

}

