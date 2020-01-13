package com.tw.service;

import com.tw.model.Location;

public class MoveToSouth implements MoveForwardInstruction {
  @Override
  public Location moveForward(Location location) {
    return new Location(location.getX(), location.getY() - 1);
  }
}
