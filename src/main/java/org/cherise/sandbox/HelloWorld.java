package org.cherise.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

  private HelloWorld() {
    // Empty constructor
  }

  public static void sayHello() {
    logger.info("Hello World!");
    logger.info("Hello Cherise!");
  }
}
