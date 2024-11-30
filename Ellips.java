/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yaseen
 */
public class Ellips extends Shape {
    protected double width ,height;

    public Ellips(double width, double higth,Point position) {
        this.width = width;
        this.height = higth;
        this.position=position;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigth() {
        return height;
    }

    public void setHigth(double higth) {
        this.height = higth;
    }
    public static Ellips CreateEllips(double width, double height,Point position) 
    {
        if(width==height)
        {
            return new Circle(width,position);
        }
        else
        {
            return new Ellips(width,height,position);
        }
    }
    

    @Override
    public void draw(Graphics canvas) {
        
        Color originalColor = canvas.getColor();
        canvas.setColor(this.getColor());
        canvas.drawOval(position.x, position.y, (int) width, (int) height);
        if (this.getFillColor() != null) {
            canvas.setColor(this.getFillColor());
            canvas.fillOval(this.getPosition().x, this.getPosition().y, (int) width, (int) height);
        }
        canvas.setColor(originalColor);
        
    }
    
    
}
