package com.tw;

import com.tw.model.Location;
import lombok.Getter;

@Getter
public class MarsRover {
  private Location location;

  private MarsRover(Location location) {
    this.location = location;
  }

  public static MarsRover land(Location location) {
    return new MarsRover(location);
  }

}
