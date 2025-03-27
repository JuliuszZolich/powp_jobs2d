package edu.kis.powp.jobs2d.figures;//
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public class CustomFigures {
    public CustomFigures() {
    }

    public static void circle(Job2dDriver driver) {
        ComplexCommand c = new ComplexCommand();
        c.addCommand(new SetPositionCommand(100, 0));
        for (int i = 0; i < 360; i++) {
            c.addCommand(new OperateToCommand((int)(Math.cos(Math.toRadians(i)) * 100), (int)(Math.sin(Math.toRadians(i)) * 100)));
        }
        c.execute(driver);
    }

    public static void triangle(Job2dDriver driver) {
        ComplexCommand c = new ComplexCommand();
        c.addCommand(new SetPositionCommand(0,0));
        c.addCommand(new OperateToCommand(100, 0));
        c.addCommand(new OperateToCommand(50, 100));
        c.addCommand(new OperateToCommand(0, 0));
        c.execute(driver);
    }

    public static void square(Job2dDriver driver) {
        ComplexCommand c = new ComplexCommand();
        c.addCommand(new SetPositionCommand(0,0));
        c.addCommand(new OperateToCommand(100, 0));
        c.addCommand(new OperateToCommand(100, 100));
        c.addCommand(new OperateToCommand(0, 100));
        c.addCommand(new OperateToCommand(0, 0));
        c.execute(driver);
    }

}
