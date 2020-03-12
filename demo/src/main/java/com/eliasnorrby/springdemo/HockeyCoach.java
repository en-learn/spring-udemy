package com.eliasnorrby.springdemo;

public class HockeyCoach implements  Coach{
  @Override
  public String getDailyWorkout() {
    return "Skate some laps";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}
