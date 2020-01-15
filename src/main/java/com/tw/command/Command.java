package com.tw.command;

import com.tw.model.RoverStatus;

public interface Command {
  void doAction(RoverStatus roverStatus);
}
