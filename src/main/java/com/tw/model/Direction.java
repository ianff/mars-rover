package com.tw.model;

public enum Direction {

  NORTH("N", "North"),
  SOUTH("S", "South");

  private String directionCode;
  private String direction;

  Direction(String directionCode, String direction) {
    this.directionCode = directionCode;
    this.direction = direction;
  }

  public String getDirectionCode() {
    return directionCode;
  }

  public String getDirection() {
    return direction;
  }

}
