package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;

public class ComplexCommand extends CommandClass{
    public ArrayList<CommandClass> list = new ArrayList<>();

    public ComplexCommand(){
        this.type = 2;
    }

    public void AddCommand(CommandClass command){
        list.add(command);
    }
}
