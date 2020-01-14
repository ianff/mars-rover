package com.tw.command;

public class CommandGenerator {
  public static String MOVE_FORWARD = "M";

  public static Command create(String instruction) {
    if(MOVE_FORWARD.equals(instruction)) {
      return new MoveForwardCommand();
    }
    return null;
  }
}
