package com.problemsolving.ElevatorProblem;

public class Elevator {
	
	private int elevatorId;
	private Boolean operationStatus; // true - Available false -> Not Available
	private int direction;   // 0 - Static  ; 1 - Up ;  2 - Down 
	private int currentFloor; 
	private int capacity;
	
	public Elevator()
	{
		
	}
	
	
	public Elevator(int elevatorId, Boolean operationStatus, int direction, int currentFloor,
			int capacity) {
		super();
		this.elevatorId = elevatorId;
		this.operationStatus = operationStatus;
		this.direction = direction;
		this.currentFloor = currentFloor;
		this.capacity = capacity;
	}
	
	public int getElevatorId() {
		return elevatorId;
	}
	public void setElevatorId(int elevatorId) {
		this.elevatorId = elevatorId;
	}
	public Boolean getOperationStatus() {
		return operationStatus;
	}
	public void setOperationStatus(Boolean operationStatus) {
		this.operationStatus = operationStatus;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "Elevator [elevatorId=" + elevatorId + ", operationStatus=" + operationStatus + ", direction="
				+ direction + ", currentFloor=" + currentFloor + ", capacity=" + capacity + "]";
	}
	

}
