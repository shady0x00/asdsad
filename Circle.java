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
public class Circle extends Ellips{

    protected double radius;

    public Circle(double radius, Point position) {
        
        super(radius/2, radius/2, position);
    }
    
    
    

}
