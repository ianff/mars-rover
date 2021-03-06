package com.tw.model;

import com.tw.service.*;

public enum Orientation {

  NORTH("N", new MoveToNorth()),
  SOUTH("S", new MoveToSouth()),
  WEST("W", new MoveToWest()),
  EAST("E", new MoveToEast());

  private String orientationCode;
  private MoveForwardInstruction moveForwardInstruction;

  Orientation(String orientationCode, MoveForwardInstruction moveForwardInstruction) {
    this.orientationCode = orientationCode;
    this.moveForwardInstruction = moveForwardInstruction;
  }

  public String getOrientationCode() {
    return orientationCode;
  }

  public MoveForwardInstruction getMoveForwardInstruction() {
    return moveForwardInstruction;
  }

  public Orientation turnLeft() {
    if(orientationCode.equals(NORTH.getOrientationCode())) {
      return WEST;
    }
    if(orientationCode.equals(SOUTH.getOrientationCode())) {
      return EAST;
    }
    if(orientationCode.equals(WEST.getOrientationCode())) {
      return SOUTH;
    }
    return NORTH;
  }

  public Orientation turnRight() {
    if(orientationCode.equals(NORTH.getOrientationCode())) {
      return EAST;
    }
    if(orientationCode.equals(SOUTH.getOrientationCode())) {
      return WEST;
    }
    if(orientationCode.equals(WEST.getOrientationCode())) {
      return NORTH;
    }
    return SOUTH;
  }
}
