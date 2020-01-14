package com.tw.model;

import lombok.Getter;

@Getter
public enum Orientation {
  NORTH("N"),
  SOUTH("S"),
  WEST("W"),
  EAST("E");

  private String orientationCode;

  Orientation(String orientationCode) {
    this.orientationCode = orientationCode;
  }
}
