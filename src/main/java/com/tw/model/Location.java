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
    } else if (orientation.equals(Orientation.SOUTH)) {
      orientation = Orientation.EAST;
    } else if (orientation.equals(Orientation.WEST)) {
      orientation = Orientation.SOUTH;
    } else {
      orientation = Orientation.NORTH;
    }
  }

  public void right() {
    if(orientation.equals(Orientation.NORTH)) {
      orientation = Orientation.EAST;
    } else if (orientation.equals(Orientation.SOUTH)) {
      orientation = Orientation.WEST;
    } else if (orientation.equals(Orientation.WEST)) {
      orientation = Orientation.NORTH;
    } else {
      orientation = Orientation.SOUTH;
    }
  }
}
