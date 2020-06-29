package com.tsunazumi.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSim {
  private int floors;
  private List<Elevator> elevators = new ArrayList<>();

  public ElevatorSim(int floors, int elevatorCount) {
    this.floors = floors;
    for (int i = 1; i < elevatorCount; i++) {
      Elevator elevator = new Elevator(1, 10);
      elevators.add(elevator);
    }
  }

  public void requestElevator(int currentFloor) {
    for (Elevator e : elevators) {
      if (e.getCurrentFloor() == currentFloor) {

      }
    }


  }
}
