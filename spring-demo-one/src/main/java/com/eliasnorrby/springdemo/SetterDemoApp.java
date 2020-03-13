package com.eliasnorrby.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
  public static void main(String[] args) {
    // load the spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve bean from spring container
    CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

    // call methods on the bean
    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.getDailyFortune());
    System.out.println(theCoach.getDailyFortune());
    System.out.println(theCoach.getDailyFortune());

    // call our new methods to get literal values
    System.out.println("Email: " + theCoach.getEmailAddress());
    System.out.println("Team: " + theCoach.getTeam());
    // close the context
    context.close();
  }
}