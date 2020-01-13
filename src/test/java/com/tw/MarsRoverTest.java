package com.tw;

import com.tw.model.Orientation;
import com.tw.model.Location;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {

  @Test
  void should_return_location_and_direction_when_landed_given_landed_information() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.NORTH;

    MarsRover marsRover = new MarsRover(location, orientation);

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.NORTH, marsRover.getOrientation());
  }

  @Test
  void should_move_forward_when_do_instruction_given_the_rover_already_landed_and_move_forward_instruction() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.NORTH;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.moveForward();

    assertEquals(new Location(10.2, 41.5), marsRover.getLocation());
    assertEquals(Orientation.NORTH, marsRover.getOrientation());
  }

  @Test
  void should_move_forward_when_do_instruction_given_the_rover_already_landed_and_face_to_south_and_move_forward_instruction() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.SOUTH;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.moveForward();

    assertEquals(new Location(10.2, 39.5), marsRover.getLocation());
    assertEquals(Orientation.SOUTH, marsRover.getOrientation());
  }

  @Test
  void should_move_forward_when_do_instruction_given_the_rover_already_landed_and_face_to_west_and_move_forward_instruction() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.WEST;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.moveForward();

    assertEquals(new Location(9.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.WEST, marsRover.getOrientation());
  }

  @Test
  void should_move_forward_when_do_instruction_given_the_rover_already_landed_and_face_to_east_and_move_forward_instruction() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.EAST;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.moveForward();

    assertEquals(new Location(11.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.EAST, marsRover.getOrientation());
  }

  @Test
  void should_face_to_west_when_turn_left_given_the_rover_already_landed_and_face_to_north() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.NORTH;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.turn("L");

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.WEST, marsRover.getOrientation());
  }

  @Test
  void should_face_to_east_when_turn_right_given_the_rover_already_landed_and_face_to_north() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.NORTH;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.turn("R");

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.EAST, marsRover.getOrientation());
  }

  @Test
  void should_face_to_east_when_turn_left_given_the_rover_already_landed_and_face_to_south() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.SOUTH;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.turn("L");

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.EAST, marsRover.getOrientation());
  }

  @Test
  void should_face_to_west_when_turn_right_given_the_rover_already_landed_and_face_to_south() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.SOUTH;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.turn("R");

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.WEST, marsRover.getOrientation());
  }

  @Test
  void should_face_to_south_when_turn_left_given_the_rover_already_landed_and_face_to_west() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.WEST;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.turn("L");

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.SOUTH, marsRover.getOrientation());
  }

  @Test
  void should_face_to_north_when_turn_right_given_the_rover_already_landed_and_face_to_west() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.WEST;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.turn("R");

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.NORTH, marsRover.getOrientation());
  }

  @Test
  void should_face_to_north_when_turn_left_given_the_rover_already_landed_and_face_to_east() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.EAST;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.turn("L");

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.NORTH, marsRover.getOrientation());
  }

  @Test
  void should_face_to_south_when_turn_right_given_the_rover_already_landed_and_face_to_east() {
    double x = 10.2;
    double y = 40.5;
    Location location = new Location(x, y);
    Orientation orientation = Orientation.EAST;

    MarsRover marsRover = new MarsRover(location, orientation);
    marsRover.turn("R");

    assertEquals(new Location(10.2, 40.5), marsRover.getLocation());
    assertEquals(Orientation.SOUTH, marsRover.getOrientation());
  }
}