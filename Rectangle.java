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
public class Rectangle extends Shape {

    /* set position */
    private double length, Width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public Rectangle(double length, double Width, Point position) {
        this.length = length;
        this.Width = Width;
        this.position = position;
    }
    //-------------------------------------------------------------------------------------------------
    //<<<<<< Factory Method Important >>>>>
    //
    public static Rectangle CreateRectangle(double length, double Width, Point position) {
        if (length == Width) {
            return new Square(length, position);
        } else {
            return new Rectangle(length, Width, position);
        }
    }
    //
    //-------------------------------------------------------------------------------------------------
    @Override
    public void draw(java.awt.Graphics canvas) {
        Color originalColor = canvas.getColor();
        canvas.setColor(this.getColor());
        canvas.drawRect(position.x, position.y, (int) length, (int) Width);
        if (this.getFillColor() != null) {
            canvas.setColor(this.getFillColor());
            canvas.fillRect(this.getPosition().x, this.getPosition().y, (int) length, (int) Width);
        }

        canvas.setColor(originalColor);
    }

}
