package com.tw.command;

import com.tw.model.Direction;
import com.tw.model.RoverStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MoveForwardCommand implements Command {

  private static Function<RoverStatus, RoverStatus> addX =
          roverStatus -> new RoverStatus(roverStatus.getX() + 1d, roverStatus.getY(), roverStatus.getDirection());

  private static Function<RoverStatus, RoverStatus> minusX =
          roverStatus -> new RoverStatus(roverStatus.getX() - 1d, roverStatus.getY(), roverStatus.getDirection());

  private static Function<RoverStatus, RoverStatus> addY =
          roverStatus -> new RoverStatus(roverStatus.getX(), roverStatus.getY() + 1d, roverStatus.getDirection());

  private static Function<RoverStatus, RoverStatus> minusY =
          roverStatus -> new RoverStatus(roverStatus.getX(), roverStatus.getY() - 1d, roverStatus.getDirection());

  private static Map<Direction, Function<RoverStatus, RoverStatus>> functionMap;

  static {
    functionMap = new HashMap<>();
    functionMap.put(Direction.NORTH, addY);
    functionMap.put(Direction.SOUTH, minusY);
    functionMap.put(Direction.WEST, minusX);
    functionMap.put(Direction.EAST, addX);
  }

  @Override
  public RoverStatus doAction(RoverStatus roverStatus) {
    return functionMap.get(roverStatus.getDirection()).apply(roverStatus);
  }
}
