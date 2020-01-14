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
    } else if(orientation.equals(Orientation.SOUTH)) {
      coordinate = new Coordinate(coordinate.getX(), coordinate.getY() - 1);
    } else if(orientation.equals(Orientation.WEST)) {
      coordinate = new Coordinate(coordinate.getX() - 1, coordinate.getY());
    } else {
      coordinate = new Coordinate(coordinate.getX() + 1, coordinate.getY());
    }
  }

  public void left() {
    if(orientation.equals(Orientation.NORTH)) {
      orientation = Orientation.WEST;
    }
  }

  public void right() {
    if(orientation.equals(Orientation.NORTH)) {
      orientation = Orientation.EAST;
    }
  }
}
