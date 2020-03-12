package com.eliasnorrby.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

    // retrieve bean from spring container
    Coach theCoach = context.getBean("myCoach", Coach.class);
    Coach alphaCoach = context.getBean("myCoach", Coach.class);

    // check if they are the same
    boolean areTheSame = (theCoach == alphaCoach);

    // print out the results
    System.out.println("\nPointing to the same object: " + areTheSame);

    System.out.println("\nMemory location for theCoach: " + theCoach);

    System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

    // close the context
    context.close();
  }
}
