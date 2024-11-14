package sampleprogram;

import java.awt.*;
import javax.swing.*;

public class Sampleprogram extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the base of the monument
        g2.setColor(new Color(169, 169, 169)); // Dark gray color for the base
        g2.fillRect(100, 200, 200, 50);

        // Draw the flagpole
        g2.setColor(Color.BLACK);
        g2.fillRect(190, 50, 10, 150);

        // Draw the flag (simplified as a rectangle)
        g2.setColor(Color.RED);
        g2.fillRect(200, 50, 50, 30);

        // Draw the main statue figure (a basic silhouette)
        g2.setColor(new Color(105, 105, 105)); // Darker gray for the statue figure
        g2.fillRect(150, 150, 100, 50); // Body of the main figure

        // Add a message below the monument
        g2.setFont(new Font("Arial", Font.BOLD, 18));
        g2.setColor(Color.BLACK);
        g2.drawString("This is Tugu Negara", 120, 270);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugu Negara Graphic Program");
        Sampleprogram panel = new Sampleprogram();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



   
