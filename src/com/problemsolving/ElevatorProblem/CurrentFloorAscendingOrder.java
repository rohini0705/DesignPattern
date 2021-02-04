package com.problemsolving.ElevatorProblem;

import java.util.Comparator;

public class CurrentFloorAscendingOrder implements Comparator<Elevator> {

	@Override
	public int compare(Elevator o1, Elevator o2) {
		
		return o1.getCurrentFloor() - o2.getCurrentFloor();
	}

}
