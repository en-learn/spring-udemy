package com.eliasnorrby.springdemo;

public class HockeyCoach implements  Coach{
  private FortuneService fortuneService;

  public HockeyCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Skate some laps";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
