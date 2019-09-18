package com.mycompany.javalab2;

import java.util.Scanner;

public class ChapterThreeQuestionFour {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input the value of your first test score.");

        
        float firstTestScore = keyboard.nextFloat();
        System.out.println("Please input the value of your second test score.");
        float secondTestScore = keyboard.nextFloat();
        System.out.println("Please input the value of your third test score.");
        float thirdTestScore = keyboard.nextFloat();
        float testScoreAverages;
        try {
            testScoreAverages = (firstTestScore + secondTestScore + thirdTestScore) / 3;
            if (testScoreAverages >= 90 && testScoreAverages <= 100) {
                System.out.println("Your test score average is: " + testScoreAverages + " which has earned you an A. \nGreat job!!!!");
            }
            if (testScoreAverages >= 80 && testScoreAverages <= 89) {
                System.out.println("Your test score average is: " + testScoreAverages + " which has earned you a B. \nYou did good.");
            }
            if (testScoreAverages >= 70 && testScoreAverages <= 79) {
                System.out.println("Your test score average is: " + testScoreAverages + " which has earned you a C. \nYou've passed!");
            }
            if (testScoreAverages >= 60 && testScoreAverages <= 69) {
                System.out.println("Your test score average is: " + testScoreAverages + " which has earned you a D. \nYou were close!");
            }
            if (testScoreAverages < 60) {
                System.out.println("Your test score average is: " + testScoreAverages + " which has earned you a F. \nYou failed!!!!!");
            }
        } catch (Exception x) {
            System.out.println("A response you have posted appears to be invalid. Please try again, and input an appro9priate test score.");
        }
    }
}
