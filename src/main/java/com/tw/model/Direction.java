package com.tw.model;

public enum Direction {
  LEFT("L");

  private String directionCode;

  Direction(String directionCode) {
    this.directionCode = directionCode;
  }

  public String getDirectionCode() {
    return directionCode;
  }
}
