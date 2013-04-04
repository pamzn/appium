package io.appium.android.bootstrap.exceptions;

/**
 * Exception for command type errors.
 * 
 * @param msg
 *          A descriptive message describing the error.
 */
public class CommandTypeException extends Exception {
  public CommandTypeException(final String msg) {
    super(msg);
  }
}
