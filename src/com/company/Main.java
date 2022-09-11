package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting speed in meters per second:");

        double startingSpeed = scanner.nextDouble();

        System.out.println("Enter the final speed in meters per second:");

        double finalSpeed = scanner.nextDouble();

        System.out.println("Enter the time interval in seconds:");

        double time = scanner.nextDouble();

        double moderateAcceleration = (finalSpeed - startingSpeed) / time;

        System.out.println("The average speed is " + moderateAcceleration);

    }
}
