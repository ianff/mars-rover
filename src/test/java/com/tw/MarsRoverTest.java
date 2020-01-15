package com.tw;

import com.tw.model.Direction;
import com.tw.model.RoverStatus;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.tw.MarsRover.land;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

  @Test
  void should_land_with_location_when_receive_init_command_given_init_command() {
    Direction direction = Direction.NORTH;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    MarsRover marsRover = land(roverStatus);

    assertEquals(roverStatus, marsRover.getRoverStatus());
  }

  @Test
  void should_increase_y_by_1_when_receive_move_forward_instruction_given_the_rover_landed() {
    Direction direction = Direction.NORTH;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "M";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(41.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.NORTH, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_decrease_y_by_1_when_receive_move_forward_instruction_given_the_rover_landed() {
    Direction direction = Direction.SOUTH;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "M";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(39.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.SOUTH, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_decrease_x_by_1_when_receive_move_forward_instruction_given_the_rover_landed() {
    Direction direction = Direction.WEST;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "M";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(9.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.WEST, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_increase_x_by_1_when_receive_move_forward_instruction_given_the_rover_landed() {
    Direction direction = Direction.EAST;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "M";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(11.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.EAST, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_face_to_west_when_receive_turn_left_instruction_given_the_rover_face_to_north() {
    Direction direction = Direction.NORTH;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "L";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.WEST, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_face_to_east_when_receive_turn_right_instruction_given_the_rover_face_to_north() {
    Direction direction = Direction.NORTH;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "R";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.EAST, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_face_to_east_when_receive_turn_left_instruction_given_the_rover_face_to_south() {
    Direction direction = Direction.SOUTH;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "L";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.EAST, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_face_to_west_when_receive_turn_right_instruction_given_the_rover_face_to_south() {
    Direction direction = Direction.SOUTH;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "R";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.WEST, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_face_to_south_when_receive_turn_left_instruction_given_the_rover_face_to_west() {
    Direction direction = Direction.WEST;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "L";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.SOUTH, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_face_to_north_when_receive_turn_right_instruction_given_the_rover_face_to_west() {
    Direction direction = Direction.WEST;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "R";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.NORTH, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_face_to_north_when_receive_turn_left_instruction_given_the_rover_face_to_east() {
    Direction direction = Direction.EAST;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "L";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.NORTH, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_face_to_south_when_receive_turn_right_instruction_given_the_rover_face_to_east() {
    Direction direction = Direction.EAST;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    String moveForwardInstruction = "R";
    instructions.add(moveForwardInstruction);

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(10.2, marsRover.getRoverStatus().getX());
    assertEquals(40.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.SOUTH, marsRover.getRoverStatus().getDirection());
  }

  @Test
  void should_be_in_82_and_395_and_facing_to_west_when_receive_instructions_given_the_rover_landed() {
    Direction direction = Direction.NORTH;
    double x = 10.2;
    double y = 40.5;
    RoverStatus roverStatus = new RoverStatus(x, y, direction);

    List<String> instructions = new ArrayList<>();
    instructions.addAll(Arrays.asList("L", "M", "M", "L", "M", "R"));

    MarsRover marsRover = land(roverStatus);
    marsRover.followInstructions(instructions);

    assertEquals(8.2, marsRover.getRoverStatus().getX());
    assertEquals(39.5, marsRover.getRoverStatus().getY());
    assertEquals(Direction.WEST, marsRover.getRoverStatus().getDirection());
  }
}