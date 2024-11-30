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
public abstract class Shape implements Shapes {

    protected Color color, fillColor;
    protected Point position;
    protected Map<String, Double> Properties;

    @Override
    public abstract void draw(Graphics canvas);

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;

    }

    @Override
    public void setFillColor(Color fillcolor) {
        this.fillColor = fillcolor;

    }

    @Override
    public Color getFillColor() {
        return this.fillColor;

    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    private Map<String, Double> properties = new HashMap<>();

// getters and setters
    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }
}
