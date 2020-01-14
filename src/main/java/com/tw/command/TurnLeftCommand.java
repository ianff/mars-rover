package com.tw.command;

import com.tw.model.Location;

public class TurnLeftCommand implements Command {
  @Override
  public void doAction(Location location) {
    location.left();
  }
}
