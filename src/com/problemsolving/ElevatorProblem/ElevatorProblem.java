package com.problemsolving.ElevatorProblem;

import java.util.Scanner;

public class ElevatorProblem {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in); 
        char ch = 'y';
		ElevatorMediatorImpl mediator = new ElevatorMediatorImpl();

		System.out.println("Enter the number of elevatorsin the building ");
		int noOfElevators = in.nextInt();
		
		for(int i=0;i<noOfElevators; i++ )
		{
			Elevator e = new Elevator( );
			e.setElevatorId(i);
			e.setCapacity(5);
			e.setCurrentFloor(i/2);
			e.setDirection(i%3);  //0
			e.setOperationStatus(true);  //available
			
			mediator.registerElevator(e);	
		}
		 
		while (ch =='y')
		{
			System.out.println("Enter the current Floor of the user");
			int currentFloor = in.nextInt();
			System.out.println("Enter the destination Floor of the user");
			int destFloor = in.nextInt();
			ElevatorUser newUser = new ElevatorUser(currentFloor,destFloor);
			mediator.assignElevator(newUser);
			System.out.println("Press 'y' to try for another user");
			ch=in.next().charAt(0);
		}
		
	}

}
