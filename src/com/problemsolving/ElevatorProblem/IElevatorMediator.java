package com.problemsolving.ElevatorProblem;

import java.util.List;

public interface IElevatorMediator {
  
    public void registerElevator(Elevator lift);
    public List<Elevator> assignElevator(ElevatorUser user); 
    public void chooseElevator(Elevator elevator); 
    public void releaseElevator(Elevator elevator); 
    public void printElevatorList();

}
