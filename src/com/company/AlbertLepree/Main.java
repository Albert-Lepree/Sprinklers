package com.company.AlbertLepree;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Scanner scan = new Scanner(System.in);

    boolean exit = true;
    char anotherCommunity = 'y';

    do {

      System.out.println("Community Name: ");
      String communityName = scan.nextLine();

      System.out.println("\nHow many houses are in the Community?: ");
      int numHouses = scan.nextInt();

      scan.nextLine(); // keeps the program from skipping the next question.

      House[] houseArray = new House[numHouses];

      for (int i = 0; i < houseArray.length; i++) {
        System.out.println("\nWhat is the Address of house " + (i + 1) + "?: ");
        String houseAddress = scan.nextLine();

        System.out.println("\nWhat is the GPH of the Rotors at house " + (i + 1) + "?: ");
        double rotorGPH = scan.nextDouble();

        System.out.println("\nWhat is the GPH of the Emitters at this house " + (i + 1) + "?: ");
        double emitterGPH = scan.nextDouble();

        System.out.println("\nWhat is the GPH of the Sprayers at this house " + (i + 1) + "?: ");
        double sprayerGPH = scan.nextDouble();

        System.out.println("\nHow many zones are in house " + (i + 1) + "?: ");
        int zoneNum = scan.nextInt();
        IrrigationZone[] zoneArray = new IrrigationZone[zoneNum];

        for (int j = 0; j < zoneArray.length; j++) {

          System.out.println("\nHow many Rotors at zone " + (j + 1) + "?: ");
          int rotorQuant = scan.nextInt();

          System.out.println("\nHow long do the Rotors run for at zone " + (j + 1) + "?: ");
          int rotorTime = scan.nextInt();

          System.out.println("\nHow many Emitters at zone " + (j + 1) + "?: ");
          int emitterQuant = scan.nextInt();

          System.out.println("\nHow long do the Emitters run for at zone " + (j + 1) + "?: ");
          int emitterTime = scan.nextInt();

          System.out.println("\nHow many Sprayers at zone " + (j + 1) + "?: ");
          int sprayerQuant = scan.nextInt();

          System.out.println("\nHow long do the Sprayers run for at zone " + (j + 1) + "?: ");
          int sprayerTime = scan.nextInt();

          zoneArray[j] = new IrrigationZone(rotorQuant, rotorTime, emitterQuant, emitterTime,
              sprayerQuant, sprayerTime);

        }

        houseArray[i] = new House(houseAddress, zoneArray, rotorGPH, emitterGPH, sprayerGPH);
        houseArray[i].getHouseGPH();

        for (int k = 0; k < zoneArray.length; k++) {
          System.out.println(zoneArray[k].toString());
        }

        System.out.println(houseArray[i].toString());

      }

      Community theCommunity = new Community(communityName, houseArray);
      System.out.println(theCommunity.toString());

      System.out.println("Another Community?(Y/N): ");
      anotherCommunity = scan.next().charAt(0); // gets the first letter of the inputed string

      if (anotherCommunity == 'y' || anotherCommunity == 'Y') { // broken???
        exit = false; // exit condition
      }
    } while (!exit);

  }
}
