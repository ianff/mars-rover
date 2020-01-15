package com.tw.command;

import com.tw.model.RoverStatus;

public class MoveForwardCommand implements Command {
  @Override
  public void doAction(RoverStatus roverStatus) {
    roverStatus.upfront();
  }
}
