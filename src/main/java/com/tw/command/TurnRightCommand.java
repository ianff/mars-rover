package com.tw.command;

import com.tw.model.RoverStatus;

public class TurnRightCommand implements Command {
  @Override
  public RoverStatus doAction(RoverStatus roverStatus) {
    return new RoverStatus(roverStatus.getX(), roverStatus.getY(), roverStatus.getDirection().right());
  }
}
