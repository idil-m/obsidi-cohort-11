package com.bptn.course._day_4_knowledge_tests;

public class FactorialExample {
    public static void main(String args[]){

        int number = 5;
        int fact = 1; // we set fact to 1 intially because if we set it to 0, anything multiplied by 0 is 0
        for (  int i = number; i > 0 ; i-- ){ // increment this loop down from the initial number down to 1, we do not include 0 because anything multiplied by 0 is 0

          fact *=i; // we are using the outside variable to store our answer, multipling every number from 5 to 1


        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
