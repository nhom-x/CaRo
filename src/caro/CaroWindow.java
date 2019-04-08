package caro;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CaroWindow
        extends JFrame
        implements CaroView {

    private PanelPicture panel = new PanelPicture();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu mnuHeThong = new JMenu();
    private JMenu mnuXanhDo = new JMenu();
    private JMenuItem mnuRobot = new JMenuItem();
    private JMenuItem mnuKhoiTao = new JMenuItem();
    private JMenuItem mnuThoat = new JMenuItem();

    public CaroWindow() {
        try {
            jbinit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void jbinit() {
        setTitle("CARO IS PLAYING");
        setFont(new Font("Times You Roman", 0, 12));
        setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 785;
        int height = 716;
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2 - 10;
        setLocation(x, y);
        setSize(new Dimension(width, height));

        setDefaultCloseOperation(3);

        this.panel.setBounds(0, 0, 780, 720);
        panel.setBackground(new java.awt.Color(102, 255, 204));
        panel.setForeground(new java.awt.Color(255, 0, 0));
        this.panel.setLayout(null);
        getContentPane().add(this.panel);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        this.mnuHeThong.setText("File");
        menuBar.add(this.mnuHeThong);

       

        

        this.mnuKhoiTao.setText("New Game");
        this.mnuHeThong.add(this.mnuKhoiTao);

        this.mnuThoat.setText("Exit");
        this.mnuHeThong.add(this.mnuThoat);
    }

    public void addMnuKhoiTaoActionListener(ActionListener actionListener) {
        this.mnuKhoiTao.addActionListener(actionListener);
    }

    public void addMnuThoatActionListener(ActionListener actionListener) {
        this.mnuThoat.addActionListener(actionListener);
    }

    public void addMnuRobotActionListener(ActionListener actionListener) {
        this.mnuRobot.addActionListener(actionListener);
    }

    public void addMouseActionListener(MouseAdapter mouseAdapter) {
        this.panel.addMouseListener(mouseAdapter);
    }

    public PanelPicture getPanel() {
        return this.panel;
    }

    public JMenu getMnuXanhDo() {
        return this.mnuXanhDo;
    }

    public JMenuItem getMnuRobot() {
        return this.mnuRobot;
    }
}
