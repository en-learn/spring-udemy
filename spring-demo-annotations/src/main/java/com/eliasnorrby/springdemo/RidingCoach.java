package com.eliasnorrby.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RidingCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Gallop for twenty minutes";
  }
}
