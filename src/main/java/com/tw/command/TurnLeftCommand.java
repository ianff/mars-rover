package com.tw.command;

import com.tw.model.RoverStatus;

public class TurnLeftCommand implements Command {
  @Override
  public void doAction(RoverStatus roverStatus) {
    roverStatus.left();
  }
}
