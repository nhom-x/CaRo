package caro;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class CaroPresenter {

    private static CaroView caroView;

    public CaroPresenter(CaroView caroView) {
        this.caroView = caroView;
        jbinit();
        allAction();
    }

    public void allAction() {
        caroView.addMnuKhoiTaoActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CaroPresenter.this.jbinit();
            }
        });
        caroView.addMnuThoatActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CaroPresenter.this.dispose();
            }
        });
       
        caroView.addMouseActionListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                CaroPresenter.this.doVe(e.getX(), e.getY());
            }
        });
    }

    public void jbinit() {
        caroView.getPanel().restartImage();
        
        repaint();
    }

    public void show() {
        caroView.show();
    }

    public void dispose() {
        caroView.dispose();
    }

    public void repaint() {
        caroView.repaint();
    }

    public void doVe(int x, int y) {
        int bool = caroView.getPanel().draw(x, y);
        
        repaint();
        if (bool == 1) {
            JOptionPane.showMessageDialog(null, "You Won");
            repaint();
        } else if (bool == 2) {
            JOptionPane.showMessageDialog(null, "You Lost");
            repaint();
        }
    }
}
