package com.example.functions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import javax.swing.*;
import java.io.IOException;
import java.lang.Math;
public class FunctionsAndSwitch {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        printAnyString("Hey you are in the cooler program");
        printAnyString("Please choose one options of these: ");
        printAnyString("A, B or C");
        String readingString= scanner.nextLine();
        
        switch (readingString.toLowerCase()) {

            case "a":
                printAnyString("Now you are in the sum program, please type 2 numbers ");
                printAnyString("Type the first number");
                int numberOne = scanner.nextInt();
                printAnyString("Type the second number");
                int numberTwo = scanner.nextInt();
                int sumResult = sumNumber(numberOne, numberTwo);
                printAnyString("Your result is " + sumResult);
                break;

            case "b":
                printAnyString("Now you are in the print of Strings program ");
                printAnyString("Type any phrase you want");
                String phraseInput = scanner.nextLine();
                printAnyString("Your phrase is: " + phraseInput);
                break;

            case "c":
                printAnyString("Now you are in the cos of a number program ");
                printAnyString("Enter a number please");
                double number=scanner.nextDouble();
                double cosResult= cosOfNumber(number);
                printAnyString("Your cos is: " + cosResult);

                break;

            default:
                System.out.println("The option is incorrect");
        }
    }

    public static void printAnyString (String message){
        System.out.println(message);
    }

    public static int sumNumber(int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }

    public static double cosOfNumber(double number){
        return Math.cos(Math.toRadians(number));
    }

}