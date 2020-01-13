package com.tw;

import com.tw.model.Direction;
import com.tw.model.Orientation;
import com.tw.model.Location;
import com.tw.service.MoveForwardInstruction;

public class MarsRover {

  private Location location;
  private Orientation orientation;

  public MarsRover(Location location, Orientation orientation) {
    this.location = location;
    this.orientation = orientation;
  }

  public Location getLocation() {
    return location;
  }

  public Orientation getOrientation() {
    return orientation;
  }

  public void moveForward() {
    MoveForwardInstruction moveForwardInstruction = orientation.getMoveForwardInstruction();
    location = moveForwardInstruction.moveForward(location);
  }

  public void turn(String direction) {
    if(direction.equals(Direction.LEFT.getDirectionCode())) {
      orientation = orientation.turnLeft();
    }
  }
}
