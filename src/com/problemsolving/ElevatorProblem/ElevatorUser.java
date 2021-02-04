package com.problemsolving.ElevatorProblem;

public class ElevatorUser {
	private int currentFloor;
	private int destFloor; 
	private int direction;
	
	public ElevatorUser(int currentFloor, int destFloor) {
		super();
		this.currentFloor = currentFloor;
		this.destFloor = destFloor;
		if(destFloor > currentFloor)
		{
			this.direction = 1;
		}
		else 
		{
			this.direction = 2;
		}
			
		
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public int getDestFloor() {
		return destFloor;
	}
	public void setDestFloor(int destFloor) {
		this.destFloor = destFloor;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "ElevatorUser [currentFloor=" + currentFloor + ", destFloor=" + destFloor + ", direction=" + direction
				+ "]";
	}
	
	

}
