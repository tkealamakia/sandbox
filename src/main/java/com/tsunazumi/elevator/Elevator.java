package com.tsunazumi.elevator;

public class Elevator {
  private int currentFloor = 1;
  private int maxFloor;
  private boolean doorsOpen = false;

  public Elevator(int currentFloor, int maxFloor) {
    this.currentFloor = currentFloor;
    this.maxFloor = maxFloor;
  }

  public void gotoFloor(int requestedFloor) {
    System.out.println("doors are closed");
    if (requestedFloor > maxFloor) {
      System.out.println("No floor " + requestedFloor + " in this building");
    }
    if (currentFloor == requestedFloor) {
      System.out.println("You are already on this floor");
    }
    if (requestedFloor > currentFloor) {
      while (currentFloor != requestedFloor) {
        System.out.println("Now on floor " + ++currentFloor);
      }
      System.out.println("doors are open");

    }
    if (requestedFloor < currentFloor) {
      while (currentFloor != requestedFloor) {
        System.out.println("Now on floor " + --currentFloor);
      }
      System.out.println("doors are open");
    }
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public static void main(String[] args) {
    Elevator e1 = new Elevator(1, 10);
    e1.gotoFloor(10);
    e1.gotoFloor(5);
  }
}
