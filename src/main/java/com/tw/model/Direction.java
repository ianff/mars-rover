package com.tw.model;

import com.tw.service.MoveForwardInstruction;
import com.tw.service.MoveToNorth;
import com.tw.service.MoveToSouth;
import com.tw.service.MoveToWest;

public enum Direction {

  NORTH("N", new MoveToNorth()),
  SOUTH("S", new MoveToSouth()),
  WEST("W", new MoveToWest());

  private String directionCode;
  private MoveForwardInstruction moveForwardInstruction;

  Direction(String directionCode, MoveForwardInstruction moveForwardInstruction) {
    this.directionCode = directionCode;
    this.moveForwardInstruction = moveForwardInstruction;
  }

  public String getDirectionCode() {
    return directionCode;
  }

  public MoveForwardInstruction getMoveForwardInstruction() {
    return moveForwardInstruction;
  }

}
