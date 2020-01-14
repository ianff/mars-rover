package com.tw.command;

public class CommandGenerator {
  public static String MOVE_FORWARD = "M";
  public static String TURN_LEFT = "L";
  public static String TURN_RIGHT = "R";

  public static Command create(String instruction) {
    if(MOVE_FORWARD.equals(instruction)) {
      return new MoveForwardCommand();
    }
    if(TURN_LEFT.equals(instruction)) {
      return new TurnLeftCommand();
    }
    if(TURN_RIGHT.equals(instruction)) {
      return new TurnRightCommand();
    }
    return null;
  }
}
