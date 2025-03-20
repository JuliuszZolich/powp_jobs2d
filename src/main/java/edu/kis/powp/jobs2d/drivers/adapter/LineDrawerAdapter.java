package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;

public class LineDrawerAdapter extends DrawerAdapter {
    private int startX = 0, startY = 0;
    private ILine chosenLine;
    private DrawPanelController controller;

    public LineDrawerAdapter(DrawPanelController controller, ILine chosenLine) {
        super(controller);
        this.chosenLine = chosenLine;
        this.controller = controller;
    }

    @Override
    public void operateTo(int x, int y) {
        chosenLine.setStartCoordinates(this.startX, this.startY);
        chosenLine.setEndCoordinates(x, y);
        setPosition(x, y);

        this.controller.drawLine(chosenLine);

    }
}
