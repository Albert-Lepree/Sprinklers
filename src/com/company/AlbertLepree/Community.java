package com.company.AlbertLepree;

public class Community {

  private String communityName;
  private House[] houseArray;
  private double communityTotal; // total gph for community

  Community(String communityName, House[] houseArray) {
    this.communityName = communityName;
    this.houseArray = houseArray;
  }

  public double getCommunityGPH() {
    for (int i = 0; i < houseArray.length; i++) {
      communityTotal += houseArray[i].getHouseGPH();
    }
    return communityTotal;
  }

  public String toString() {
    return "GPH for " + communityName + ": " + getCommunityGPH();
  }
}
