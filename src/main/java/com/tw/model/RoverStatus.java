package com.tw.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class RoverStatus {
  private double x;
  private double y;
  private Direction direction;

  public void upfront() {
    if(direction.equals(Direction.NORTH)) {
      y++;
    } else if(direction.equals(Direction.SOUTH)) {
      y--;
    } else if(direction.equals(Direction.WEST)) {
      x--;
    } else {
      x++;
    }
  }

  public void left() {
    if(direction.equals(Direction.NORTH)) {
      direction = Direction.WEST;
    } else if (direction.equals(Direction.SOUTH)) {
      direction = Direction.EAST;
    } else if (direction.equals(Direction.WEST)) {
      direction = Direction.SOUTH;
    } else {
      direction = Direction.NORTH;
    }
  }

  public void right() {
    if(direction.equals(Direction.NORTH)) {
      direction = Direction.EAST;
    } else if (direction.equals(Direction.SOUTH)) {
      direction = Direction.WEST;
    } else if (direction.equals(Direction.WEST)) {
      direction = Direction.NORTH;
    } else {
      direction = Direction.SOUTH;
    }
  }
}
