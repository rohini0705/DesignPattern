package com.problemsolving.ElevatorProblem;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElevatorMediatorImpl implements IElevatorMediator {
	
	LinkedList<Elevator> elevatorList = new LinkedList<>();

	@Override
	public void registerElevator(Elevator lift) {
		elevatorList.add(lift);
	}

	@Override
	public List<Elevator> assignElevator(ElevatorUser user) {
		List<Elevator> bestFitElevators = new LinkedList<Elevator>();
		
		printElevatorList();
		System.out.println("User Details : " + user);
		
		System.out.println("=====================================");
		if(user.getCurrentFloor() == user.getDestFloor())
		{
			System.out.println("User is already in the destination floor");
			return null;
		}
		
		// Identify elevators that are operational and have capacity to accomodate ppl
		Stream<Elevator> availableMovingElevators = elevatorList.stream()
				.filter((e)-> (e.getOperationStatus()==true))
				.filter((e)-> (e.getCapacity() <7))
				.filter((e)-> (e.getDirection() == user.getDirection())) ;
		
		Stream<Elevator> availableStaticElevators = elevatorList.stream()
				.filter((e)-> (e.getOperationStatus()==true))
				.filter((e)-> (e.getCapacity() <7))
				.filter((e)-> (e.getDirection() == 0)) ;
		
		// Start with Elevators that are currently moving in the direction of the User need
		if(user.getDirection() == 1 ) // User is moving in upward direction 
		{
			System.out.println("User is moving in Upward Direction.");
			bestFitElevators = availableMovingElevators
					.filter((e)-> (e.getDirection() == user.getDirection())) 
					.filter((e) -> (e.getCurrentFloor() <= user.getCurrentFloor()) )
					.collect(Collectors.toList());
			
			// If all the elevators in motion are not the best fit for the user, chec the static ones 
			if(bestFitElevators.isEmpty())
			{
				bestFitElevators = availableStaticElevators
						// .filter((e) -> (e.getCurrentFloor() <= user.getCurrentFloor()))
						.collect(Collectors.toList());
			}
			bestFitElevators.forEach((e)->System.out.println(e));
		}
		else
		{
			System.out.println("User is moving in Downward Direction.");
			bestFitElevators = availableMovingElevators
					.filter((e)-> (e.getDirection() == user.getDirection())) 
					.filter((e) -> (e.getCurrentFloor() >= user.getCurrentFloor()))
					.collect(Collectors.toList());
			
			// If all the elevators in motion are not the best fit for the user, chec the static ones 
			if(bestFitElevators.isEmpty())
			{
				bestFitElevators = availableStaticElevators
						//.filter((e) -> (e.getCurrentFloor() >= user.getCurrentFloor()))
						.collect(Collectors.toList());
			}

			bestFitElevators.forEach((e)->System.out.println(e));
		}
		
		return bestFitElevators;

	}

	@Override
	public void releaseElevator(Elevator elevator) {
		//once the user releases the elevator, we can decrement capacity, set the current floot of the lift to the users dest floor
	}

	@Override
	public void printElevatorList() {
		
		System.out.println("Printing Complete Elevator List");
		elevatorList.forEach((e)->System.out.println(e));
	}

	@Override
	public void chooseElevator(Elevator elevator) {
		// once the user selects the elevator, we ca increment the capacity, change the currentfloor of elevator to users currentFloor
		
	}

}
