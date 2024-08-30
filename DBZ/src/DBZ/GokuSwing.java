package DBZ;

import javax.swing.*;
import java.awt.*;

public class GokuSwing extends JFrame {
    public GokuSwing() {
        setTitle("Goku in Java Swing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add custom panel to the frame
        add(new GokuPanel());
    }

    // Custom JPanel to draw Goku
    class GokuPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Set rendering hints for better graphics quality
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Draw Goku's hair
            g2d.setColor(Color.BLACK);
            g2d.fillPolygon(new int[]{100, 130, 160}, new int[]{100, 50, 100}, 3); // Left spike
            g2d.fillPolygon(new int[]{160, 190, 220}, new int[]{100, 30, 100}, 3); // Middle spike
            g2d.fillPolygon(new int[]{220, 250, 280}, new int[]{100, 50, 100}, 3); // Right spike

            // Draw Goku's face
            g2d.setColor(new Color(255, 220, 185)); // Skin color
            g2d.fillOval(130, 100, 120, 150); // Face shape

            // Draw Goku's eyes
            g2d.setColor(Color.BLACK);
            g2d.fillOval(160, 150, 20, 20); // Left eye
            g2d.fillOval(220, 150, 20, 20); // Right eye

            // Draw Goku's mouth
            g2d.drawArc(180, 200, 40, 20, 0, -180);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GokuSwing frame = new GokuSwing();
            frame.setVisible(true);
        });
    }
}

