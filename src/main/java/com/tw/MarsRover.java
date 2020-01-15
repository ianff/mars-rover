package com.tw;

import com.tw.command.Command;
import com.tw.command.CommandGenerator;
import com.tw.model.Direction;
import com.tw.model.RoverStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class MarsRover {
  private RoverStatus roverStatus;

  public static MarsRover land(RoverStatus roverStatus) {
    return new MarsRover(roverStatus);
  }

  public void followInstructions(List<String> instructions) {
    for(String instruction : instructions) {
      Command command = CommandGenerator.create(instruction);
      command.doAction(roverStatus);
    }
  }
}
