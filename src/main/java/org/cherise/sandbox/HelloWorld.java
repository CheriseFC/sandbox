package org.cherise.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    logger.info("Hello World!");
    logger.info("Hello Cherise!");

    int i = 5;
    logger.info("My first number {}", i);
  }
}
