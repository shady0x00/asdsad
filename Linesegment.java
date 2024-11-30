/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minipaint;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author yaseen
 */
public class Linesegment extends Shape {

    private double length;

    public Linesegment(double length, Point position) {
        this.length = length;
        this.position = position;
       
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public void draw(java.awt.Graphics canvas)
   {
       Color originalColor = canvas.getColor();
       canvas.setColor(this.getColor());
        canvas.drawLine(position.x, position.y, position.x+(int)length, position.y);
       
       if(this.getFillColor() != null)
       {
           canvas.setColor(this.getFillColor());
           canvas.fillOval(this.getPosition().x, this.getPosition().y , position.x+(int)length, position.y);
       }
       
       canvas.setColor(originalColor);  
   }

}
