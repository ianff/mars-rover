package com.tw.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Location {
  private double x;
  private double y;

  public Location(double x, double y) {
    this.x = x;
    this.y = y;
  }
}
