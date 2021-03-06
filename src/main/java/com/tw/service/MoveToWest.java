package com.tw.service;

import com.tw.model.Location;

public class MoveToWest implements MoveForwardInstruction {
  @Override
  public Location moveForward(Location location) {
    return new Location(location.getX() - 1, location.getY());
  }
}
