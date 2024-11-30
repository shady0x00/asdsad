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
 public class Square extends Rectangle
{
     private double side;
    public Square(double side, Point position) {
        super(side, side, position);
    }
}
