package com.eliasnorrby.springdemo;

public class RandomFortuneService implements FortuneService {

  private String[] fortunes =
      new String[] {
        "You're doing great.", "It will rain today.", "Your boss is having a hard time."
      };

  @Override
  public String getFortune() {
    int index = (int) Math.floor(Math.random() * fortunes.length);
    return fortunes[index];
  }
}
