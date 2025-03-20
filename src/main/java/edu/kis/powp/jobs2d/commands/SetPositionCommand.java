package edu.kis.powp.jobs2d.commands;

public class SetPositionCommand extends CommandClass{

    public SetPositionCommand(int x, int y){
        this.type = 1;
        this.x = x;
        this.y = y;
    }
}
