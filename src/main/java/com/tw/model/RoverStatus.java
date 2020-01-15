package com.tw.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class RoverStatus {
  private double x;
  private double y;
  private Direction direction;
}
