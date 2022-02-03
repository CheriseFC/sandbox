package org.cherise.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimitiveTypes {

  private static final Logger logger = LoggerFactory.getLogger(PrimitiveTypes.class);

  private PrimitiveTypes() {
    // Empty constructor
  }

  public static void displayIntLimits() {
    // integers occupy 32 bits (width = 32)
    int minIntValue = Integer.MIN_VALUE;
    int maxIntValue = Integer.MAX_VALUE;

    logger.info("int min: {}", minIntValue);
    logger.info("int max: {}", maxIntValue);
    logger.info("busted int min: {} <-- underflow", minIntValue - 1);
    logger.info("busted int max: {} <-- overflow", maxIntValue + 1);

    // java 7+ lets you separate the grouped place values with underscores
//    int overflowMax = 2_147_483_648; // this causes an error
  }

  public static void displayByteLimits() {
    // bytes occupy 8 bits (width = 8)
    byte minByteValue = Byte.MIN_VALUE;
    byte maxByteValue = Byte.MAX_VALUE;

    logger.info("byte min: {}", minByteValue);
    logger.info("byte max: {}", maxByteValue);
  }

  public static void displayShortLimits() {
    // shorts occupy 16 bits (width = 16)
    short minShortValue = Short.MIN_VALUE;
    short maxShortValue = Short.MAX_VALUE;

    logger.info("short min: {}", minShortValue);
    logger.info("short max: {}", maxShortValue);
  }

  public static void displayLongLimits() {
    // long occupy 64 bits (width = 64)
    long minLongValue = Long.MIN_VALUE;
    long maxLongValue = Long.MAX_VALUE;
    long l0 = 100L; // add capital L to have java treat it as a long and not assume it's an integer
    long l1 = 2_147_483_648_234L; // fix integer number too large by appending L

    logger.info("long min: {}", minLongValue);
    logger.info("long max: {}", maxLongValue);
    logger.info("long 0: {}", l0);
    logger.info("long 1: {}", l1);
  }

}
