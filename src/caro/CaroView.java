package caro;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public abstract interface CaroView {

    public abstract void show();

    public abstract void dispose();

    public abstract void repaint();

    public abstract PanelPicture getPanel();

    public abstract JMenu getMnuXanhDo();

    public abstract JMenuItem getMnuRobot();

    public abstract void addMnuKhoiTaoActionListener(ActionListener paramActionListener);

    public abstract void addMnuThoatActionListener(ActionListener paramActionListener);

    public abstract void addMnuRobotActionListener(ActionListener paramActionListener);

    public abstract void addMouseActionListener(MouseAdapter paramMouseAdapter);
}
