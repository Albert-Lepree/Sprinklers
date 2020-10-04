package com.company.AlbertLepree;

public class IrrigationZone {

  private int rotorsQuant;
  private int rotorsTime;
  private int emittersQuant;
  private int emittersTime;
  private int sprayerQuant;
  private int sprayerTime;
  private final double hour = 60; // minutes
  private double zoneTotal;

  IrrigationZone(int rotorsQuant, int rotorsTime, int emittersQuant, int emittersTime,
      int sprayerQuant, int sprayerTime) {
    this.rotorsQuant = rotorsQuant;
    this.rotorsTime = rotorsTime;
    this.emittersQuant = emittersQuant;
    this.emittersTime = emittersTime;
    this.sprayerQuant = sprayerQuant;
    this.sprayerTime = sprayerTime;


  }

  public double calcZoneGPH(double rotorGPH, double emitterGPH, double sprayerGPH) {
    this.zoneTotal = (rotorsQuant * (rotorsTime / hour) * rotorGPH) + (emittersQuant * (
        emittersTime / hour) * emitterGPH) + (sprayerQuant * (sprayerTime / hour) * sprayerGPH);
    return this.zoneTotal;
  }

  public String toString() {
    return "Zone GPH: " + this.zoneTotal;
  }
}
