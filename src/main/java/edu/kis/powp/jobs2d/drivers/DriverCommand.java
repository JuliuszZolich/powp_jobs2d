package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.commands.CommandClass;
import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.adapter.MyAdapter;

public class DriverCommand{
    private Job2dDriver driver;

    public DriverCommand(){
        this.driver = new MyAdapter();
    }
    public DriverCommand(Job2dDriver driver){
        this.driver = driver;
    }

    public void setDriver(Job2dDriver driver){
        this.driver = driver;
    }

    void execute(CommandClass command){
        switch (command.type){
            case 0:
                driver.operateTo(command.x, command.y);
                break;
            case 1:
                driver.setPosition(command.x, command.y);
                break;
            case 2:
                for (CommandClass subCommand: ((ComplexCommand)command).list){
                    execute(subCommand);
                }
                break;
            default:
                break;
        }
    }
}