//sk221
package com.mycompany.javalab2;

import javax.swing.JOptionPane;

public class Chapter4Question1 {

    public static void main(String[] args) {
        String numberYouEnter = JOptionPane.showInputDialog("Please input a positive integer");

        float numberYouEnterInteger = Float.parseFloat(numberYouEnter);
        int previousNumberInLoop = 0;
        int currentSumOfNumbers = 0;
        int counter = 0;
        while (counter <= numberYouEnterInteger){
        previousNumberInLoop = currentSumOfNumbers;
        currentSumOfNumbers = counter + previousNumberInLoop; 
        counter += 1;
        
        }
        System.out.println("The total sum of all numbers leading up, and including"
                + "the number you have entered is: " + currentSumOfNumbers);
        
    }
}
