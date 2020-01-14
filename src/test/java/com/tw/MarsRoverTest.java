package com.tw;

import com.tw.model.Coordinate;
import com.tw.model.Location;
import com.tw.model.Orientation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

  @Test
  void should_increase_y_by_1_when_receive_move_forward_instruction_given_the_rover_landed() {
    Orientation orientation = Orientation.NORTH;
    Coordinate coordinate = new Coordinate(10.2, 40.5);
    Location location = new Location(orientation, coordinate);
    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "M";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(location);
    marsRover.followInstructions(instructions);

    assertEquals(new Coordinate(10.2, 41.5), marsRover.getLocation().getCoordinate());
    assertEquals(Orientation.NORTH, marsRover.getLocation().getOrientation());
  }
}