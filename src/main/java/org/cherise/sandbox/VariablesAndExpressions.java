package org.cherise.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VariablesAndExpressions {

  private static final Logger logger = LoggerFactory.getLogger(VariablesAndExpressions.class);

  public VariablesAndExpressions() {
    // Empty constructor
  }

  public static void printInts() {
    int i0 = (10 + 5) + (2 * 10);
    int i1 = 12;
    int i2 = i0 * 2;
    int iTotal = i0 + i1 + i2;
    int iLast = 1000 - iTotal;
    logger.info("\n\tFirst {}\n\t"
        + "Second {}\n\t"
        + "Third {}\n\t"
        + "Total {}\n\t"
        + "Last {}", i0 , i1, i2, iTotal, iLast);
  }
}
