package com.tw.command;

import com.tw.model.Location;

public class MoveForwardCommand implements Command {
  @Override
  public void doAction(Location location) {
    location.upfront();
  }
}
