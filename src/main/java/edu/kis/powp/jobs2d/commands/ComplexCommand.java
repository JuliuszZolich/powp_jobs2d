package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;

public class ComplexCommand extends DriverCommand {
    public ArrayList<DriverCommand> list = new ArrayList<>();

    public void addCommand(DriverCommand command){
        list.add(command);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command : list){
            command.execute(driver);
        }
    }
}
