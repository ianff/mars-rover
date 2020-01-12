package com.tw;

import com.tw.model.Direction;
import com.tw.model.Location;

public class MarsRover {

  private Location location;
  private Direction direction;

  public MarsRover(Location location, Direction direction) {
    this.location = location;
    this.direction = direction;
  }

  public Location getLocation() {
    return location;
  }

  public Direction getDirection() {
    return direction;
  }
}
