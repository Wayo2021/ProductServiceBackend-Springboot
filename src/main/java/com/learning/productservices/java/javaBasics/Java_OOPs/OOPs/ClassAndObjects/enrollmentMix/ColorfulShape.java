package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;
import java.applet.*;
import java.awt.*;
public class ColorfulShape {
    Font fn;
    Color c;
    public void init(){
        setBackground(Color.lightGray);
        fn = new Font("Tahoma", Font.BOLD, 12);
    }
    
    private void setBackground(Color lightgray) {
    }

    public void paint(Graphics g) {
        g.setFont(fn);
        g.drawArc(10, 20, 180, 180, 0, 180);    g.drawString("drawArc1", 70, 40);
        g.setColor(Color.magenta);      g.drawRect(50, 50, 100, 15);
        g.drawString("drawRect", 70, 62);   g.setColor(Color.blue);
        g.fillRect(50, 70, 100, 15);    g.setColor(Color.white);
        g.drawString("fillRect", 80, 82);   g.setColor(Color.green);
        g.drawOval(50, 110, 100, 30);   g.drawString("drawOval", 70, 130);
        g.setColor(Color.black);    g.fillOval(50, 145, 100, 30);
        g.setColor(Color.white);    g.drawString("fillOval", 80, 165);       
    }
}
