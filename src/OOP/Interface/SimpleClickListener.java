package OOP.Interface;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SimpleClickListener implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Clicked аt " + e.getX() + "," + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

class Main {
    public static void main(String[] args) {
        // создаем окно
        JFrame jf = new JFrame();
        // устанавливаем ему размеры
        jf.setSize(400, 400);
        // и показываем его
        jf.setVisible(true);
        jf.addMouseListener((MouseListener) new SimpleClickListener());
    }
}

