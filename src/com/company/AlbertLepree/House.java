package com.company.AlbertLepree;

public class House {

  private String address;
  private IrrigationZone[] zoneArray;
  private double houseTotal;
  private double rotorGPH;
  private double emitterGPH;
  private double sprayerGPH;

  House(String address, IrrigationZone[] zoneArray, double rotorGPH, double emitterGPH,
      double sprayerGPH) {
    this.address = address;
    this.zoneArray = zoneArray;
    this.rotorGPH = rotorGPH;
    this.emitterGPH = emitterGPH;
    this.sprayerGPH = sprayerGPH;
    this.rotorGPH = rotorGPH;
    this.emitterGPH = emitterGPH;
    this.sprayerGPH = sprayerGPH;
  }

  public double getHouseGPH() {
    for (int i = 0; i < zoneArray.length; i++) {
      houseTotal += zoneArray[i].calcZoneGPH(rotorGPH, emitterGPH, sprayerGPH);
    }
    return houseTotal;
  }

  public String getAddress() {
    return address;
  }

  public String toString() {
    return "GPH at " + address + ": " + getHouseGPH();
  }
}
