package com.tw.model;

import lombok.Getter;

@Getter
public enum Direction {
  NORTH("N"),
  SOUTH("S"),
  WEST("W"),
  EAST("E");

  private String directionCode;

  Direction(String directionCode) {
    this.directionCode = directionCode;
  }
}
