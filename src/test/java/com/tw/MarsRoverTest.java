package com.tw;

import com.tw.model.Coordinate;
import com.tw.model.Location;
import com.tw.model.Orientation;
import org.junit.jupiter.api.Test;

import static com.tw.MarsRover.land;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

  @Test
  void should_land_with_location_when_receive_init_command_given_init_command() {
    Orientation orientation = Orientation.NORTH;
    Coordinate coordinate = new Coordinate(10.2, 40.5);
    Location location = new Location(orientation, coordinate);

    MarsRover marsRover = land(location);

    Location expectedLocation = new Location(orientation, coordinate);
    assertEquals(expectedLocation, marsRover.getLocation());
  }
}