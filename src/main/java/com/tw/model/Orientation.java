package com.tw.model;

import lombok.Getter;

@Getter
public enum Orientation {
  NORTH("N");

  private String orientationCode;

  Orientation(String orientationCode) {
    this.orientationCode = orientationCode;
  }
}
