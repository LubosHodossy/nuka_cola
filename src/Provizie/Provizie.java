package Provizie;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Provizie extends JComponent implements Serializable, Accessible, SwingConstants {
    JFrame f;
    Provizie() {
        f = new JFrame();
        Font mojfont = new Font("Serif", Font.BOLD, 12);
        JTextArea ta = new JTextArea(300, 300);

        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(300, 300, 300, 300);

        tp.add("Provizie", panel0);
        tp.add("Lubos", panel1);
        tp.add("Janko", panel2);
        tp.add("Martin", panel3);

        f.add(tp);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setFont(mojfont);
        panel1.add(ta);
    }

    public static void main(String[] args) {
        new Provizie();
    }
}
