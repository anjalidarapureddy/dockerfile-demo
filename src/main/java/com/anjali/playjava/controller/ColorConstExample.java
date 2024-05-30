package com.anjali.playjava.controller;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class ColorConstExample extends Frame
{
    /* Driver Code */
    public ColorConstExample()
    {
        super("Color Code Example");
        prepareGUI();
    }

    public static void main(String[] args)
    {
        ColorConstExample obj = new ColorConstExample();
        obj.setVisible(true);
    }

    private void prepareGUI()
    {
        setSize(400,400);
        setBackground(Color.black);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent windowEvent)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        Font plainFont = new Font("Serif", Font.PLAIN, 24);
        g2.setFont(plainFont);
        /* Color Constant */
        g2.setColor(Color.cyan);
        g2.drawString("Welcome to  the nginx web page ", 50, 70);
        g2.setColor(Color.BLUE);
        g2.drawString("You can ready to deploy your applications here:", 50, 120);
        g2.setColor(Color.red);
        g2.drawString("Start your apllication and enjoy the features",50,200);
    }
}