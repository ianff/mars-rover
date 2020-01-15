package com.tw.model;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Direction {
  NORTH(0),
  EAST(1),
  SOUTH(2),
  WEST(3);

  private int index;

  Direction(int index) {
    this.index = index;
  }

  public Direction left() {
    return find((this.index + 3) % 4);
  }

  public Direction right() {
    return find((this.index + 1) % 4);
  }

  private Direction find(int index) {
    return Arrays.stream(Direction.values())
            .filter(direction -> direction.getIndex() == index)
            .findAny()
            .orElse(null);
  }
}
