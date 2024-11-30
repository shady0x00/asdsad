/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minipaint;

import java.util.ArrayList;

/**
 *
 * @author yaseen
 */
public interface DrawingEngine {

    public void addShape(Shapes shape);

    public void removeShape(Shapes shape);

    public ArrayList< Shapes> getShapes();

    public void refresh(java.awt.Graphics canvas);

}
