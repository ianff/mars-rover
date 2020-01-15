package com.tw.command;

import com.tw.model.RoverStatus;

public class TurnRightCommand implements Command {
  @Override
  public void doAction(RoverStatus roverStatus) {
    roverStatus.right();
  }
}
