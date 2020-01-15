package com.tw.command;

import com.tw.model.RoverStatus;

public interface Command {
  RoverStatus doAction(RoverStatus currentRoverStatus);
}
