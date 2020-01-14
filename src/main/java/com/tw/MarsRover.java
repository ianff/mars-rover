package com.tw;

import com.tw.command.Command;
import com.tw.command.CommandGenerator;
import com.tw.model.Location;
import lombok.Getter;

import java.util.List;

@Getter
public class MarsRover {
  private Location location;

  private MarsRover(Location location) {
    this.location = location;
  }

  public static MarsRover land(Location location) {
    return new MarsRover(location);
  }

  public void followInstructions(List<String> instructions) {
    for(String instruction : instructions) {
      Command command = CommandGenerator.create(instruction);
      command.doAction(location);
    }
  }
}
