package com.work; //name of my package

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Calculator using java  : ");
      Scanner data = new Scanner(System.in);
      System.out.print(" Enter your operator to be perform (+,- ,* ,/,%) : ");
      char operator = data.next().charAt(0);
      System.out.println(" Enter your first value : ");
      Double num1 = data.nextDouble();
      System.out.println(" Enter your second  value : ");
      Double num2 = data.nextDouble();
      
      
      switch (operator) {
    	  case '+':
    		  System.out.print("The sum of "+ num1+ " and " + num2 + "is"+ (num1+num2));
    		  break;
    	  case '-':
    		  System.out.print("The sub of "+  num1 + " and " + num2 + " is " + (num1-num2));
    		  break;
    	  case '*':
    		  System.out.print("The multi of "+  num1 + " and " + num2 + " is " + (num1*num2));
    		  break;
    	  case '/':
    		  System.out.print("The div of "+  num1 + " and " + num2 + " is " + (num1/num2));
    		  break;
    	  case '%':
    		  System.out.print("The mud of "+  num1 + " and " + num2 + " is " + (num1 % num2));
    		  break;
  	}
      
     
	}



 

}
