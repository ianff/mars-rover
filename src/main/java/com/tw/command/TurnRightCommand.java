package com.tw.command;

import com.tw.model.Location;

public class TurnRightCommand implements Command {
  @Override
  public void doAction(Location location) {
    location.right();
  }
}
