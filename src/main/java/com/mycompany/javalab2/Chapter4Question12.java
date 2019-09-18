package com.mycompany.javalab2;

import java.util.Scanner;

public class Chapter4Question12 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the first store's sales");
        float storeOneSales = keyboard.nextFloat();
        String storeOneString = "Store one sales: ";
        int counterOne = 100;
        while (storeOneSales >= counterOne) {
            storeOneString += "*";
            counterOne += 100;
        }

        System.out.println("Please enter the second store's sales");
        float storeTwoSales = keyboard.nextFloat();
        String storeTwoString = "Store one sales: ";
        int counterTwo = 100;
        while (storeTwoSales >= counterTwo) {
            storeTwoString += "*";
            counterTwo += 100;
        }

        System.out.println("Please enter the third store's sales");
        float storeThreeSales = keyboard.nextFloat();
        String storeThreeString = "Store one sales: ";
        int counterThree = 100;
        while (storeThreeSales >= counterThree) {
            storeThreeString += "*";
            counterThree += 100;
        }

        System.out.println("Please enter the fourth store's sales");
        float storeFourSales = keyboard.nextFloat();
        String storeFourString = "Store one sales: ";
        int counterFour = 100;
        while (storeFourSales >= counterFour) {
            storeFourString += "*";
            counterFour += 100;
        }

        System.out.println("Please enter the fifth store's sales");
        float storeFiveSales = keyboard.nextFloat();
        String storeFiveString = "Store one sales: ";
        int counterFive = 100;
        while (storeFiveSales >= counterFive) {
            storeFiveString += "*";
            counterFive += 100;
        }

        System.out.println(storeOneString);
        System.out.println(storeTwoString);
        System.out.println(storeThreeString);
        System.out.println(storeFourString);
        System.out.println(storeFiveString);

    }

}
