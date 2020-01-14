package com.tw.command;

import com.tw.model.Location;

public interface Command {
  void doAction(Location location);
}
