package com.tw.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Location {
  private Orientation orientation;
  private Coordinate coordinate;
}
