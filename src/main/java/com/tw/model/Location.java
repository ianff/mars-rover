package com.tw.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class Location {
  private Orientation orientation;
  private Coordinate coordinate;

  public void upfront() {
    if(orientation.equals(Orientation.NORTH)) {
      coordinate = new Coordinate(coordinate.getX(), coordinate.getY() + 1);
    }
  }
}
