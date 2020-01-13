package com.tw;

import com.tw.model.Direction;
import com.tw.model.Location;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

  @Test
  void should_return_location_and_direction_when_landed_given_landed_information() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Direction direction = Direction.NORTH;

    MarsRover marsRover = new MarsRover(location, direction);

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Direction.NORTH, marsRover.getDirection());
  }

  @Test
  void should_move_forward_when_do_instruction_given_the_rover_already_landed_and_move_forward_instruction() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Direction direction = Direction.NORTH;

    MarsRover marsRover = new MarsRover(location, direction);
    marsRover.moveForward();

    assertEquals(new Location(10.2, 41.5), marsRover.getLocation());
    assertEquals(Direction.NORTH, marsRover.getDirection());
  }

  @Test
  void should_move_forward_when_do_instruction_given_the_rover_already_landed_and_face_to_south_and_move_forward_instruction() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Direction direction = Direction.SOUTH;

    MarsRover marsRover = new MarsRover(location, direction);
    marsRover.moveForward();

    assertEquals(new Location(10.2, 39.5), marsRover.getLocation());
    assertEquals(Direction.SOUTH, marsRover.getDirection());
  }
}