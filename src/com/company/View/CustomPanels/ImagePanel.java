package com.company.View.CustomPanels;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(String imagePath) {

        super(new GridBagLayout());
        try
        {
            image = ImageIO.read(getClass().getResource(imagePath));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

