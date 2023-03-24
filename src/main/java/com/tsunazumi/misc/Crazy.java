package com.tsunazumi.misc;

import javax.swing.*;
import java.awt.*;

import java.util.Random;

public class Crazy extends JPanel {
  private int x, y; // current position of the box
  private int dx = 5, dy = 5; // movement in x and y directions
  private int width = 50, height = 50; // size of the box
  private Color color = Color.RED; // current color of the box
  private Random random = new Random(); // random number generator

  public Crazy() {
    // set the initial position randomly
    x = random.nextInt(width );
    y = random.nextInt(height);
    // start the animation timer
    Timer timer = new Timer(50, e -> {
      // move the box
      x += dx;
      y += dy;
      // check if the box hits a side
      if (x <= 0 || x + width >= getWidth()) {
        dx = -dx;
        color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
      }
      if (y <= 0 || y + height >= getHeight()) {
        dy = -dy;
        color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
      }
      // repaint the panel
      repaint();
    });
    timer.start();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(color);
    g.fillRect(x, y, width, height);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Bouncing Box");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null);
    Crazy box = new Crazy();
    frame.add(box);
    frame.setVisible(true);
  }
}