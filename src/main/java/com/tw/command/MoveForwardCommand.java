package com.tw.command;

import com.tw.model.Direction;
import com.tw.model.RoverStatus;

public class MoveForwardCommand implements Command {
  @Override
  public RoverStatus doAction(RoverStatus roverStatus) {
    if(roverStatus.getDirection().equals(Direction.NORTH)) {
      return new RoverStatus(roverStatus.getX(), roverStatus.getY() + 1, roverStatus.getDirection());
    } else if(roverStatus.getDirection().equals(Direction.SOUTH)) {
      return new RoverStatus(roverStatus.getX(), roverStatus.getY() - 1, roverStatus.getDirection());
    } else if(roverStatus.getDirection().equals(Direction.WEST)) {
      return new RoverStatus(roverStatus.getX() - 1, roverStatus.getY(), roverStatus.getDirection());
    } else {
      return new RoverStatus(roverStatus.getX() + 1, roverStatus.getY(), roverStatus.getDirection());
    }
  }
}
