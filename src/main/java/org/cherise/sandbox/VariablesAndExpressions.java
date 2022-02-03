package org.cherise.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VariablesAndExpressions {

  private static final Logger logger = LoggerFactory.getLogger(VariablesAndExpressions.class);

  private VariablesAndExpressions() {
    // Empty constructor
  }

  public static void printInts() {
    int i0 = (10 + 5) + (2 * 10);
    int i1 = 12;
    int i2 = i0 * 2;
    int iTotal = i0 + i1 + i2;
    int iLast = 1000 - iTotal;
    logger.info("First {}", i0);
    logger.info("Second {}", i1);
    logger.info("Third {}", i2);
    logger.info("Total {}", iTotal);
    logger.info("Last {}", iLast);
  }
}
