package com.mycompany.javalab2;
//sk221

import javax.swing.JOptionPane;

public class ChapterThreeQuestion15 {

    public static void main(String[] args) {

        String checksWritten = JOptionPane.showInputDialog("Please input the number of checks you've written as an integer.");

        int baseFee = 10;
        int checksWrittenInteger = Integer.parseInt(checksWritten);
        if (checksWrittenInteger < 20) {
            float feeForTheMonth = checksWrittenInteger * .1F + baseFee;
            System.out.println("Your total banking fee for the month amounts to: $" + feeForTheMonth);
        }
        if (checksWrittenInteger >= 20 && checksWrittenInteger <= 39) {
            float feeForTheMonth = checksWrittenInteger * .08F + baseFee;
            System.out.println("Your total banking fee for the month amounts to: $" + feeForTheMonth);
        }
        if (checksWrittenInteger >= 40 && checksWrittenInteger <= 59) {
            float feeForTheMonth = checksWrittenInteger * .06F + baseFee;
            System.out.println("Your total banking fee for the month amounts to: $" + feeForTheMonth);
        }
        if (checksWrittenInteger >= 60) {
            float feeForTheMonth = checksWrittenInteger * .04F + baseFee;
            System.out.println("Your total banking fee for the month amounts to: $" + feeForTheMonth);
        }
    }

}
