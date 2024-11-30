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
class Engine implements DrawingEngine {

    private ArrayList<Shapes> shapelist = new ArrayList<Shapes>();
    private ArrayList<Circle> circlelist = new ArrayList<>();
    private ArrayList<Rectangle> rectanglelist = new ArrayList<>();
    private ArrayList<Ellips> ellipslist = new ArrayList<>();
    private ArrayList<Square> squarelist = new ArrayList<>();
    private ArrayList<Linesegment> linesegmentlist = new ArrayList<>();
    
    public int countRec = 0, countSqu = 0, countEllips = 0, countCir = 0, countLine = 0;

    @Override
    public void addShape(Shapes shape) {
        shapelist.add(shape);
    }

    @Override
    public void removeShape(Shapes shape) {
        shapelist.remove(shape);

    }

    @Override
    public ArrayList<Shapes> getShapes() {

        return shapelist;
    }

    public int getCountRec() {
        return ++countRec;
    }

    public int getCountSqu() {
        return ++countSqu;
    }

    public int getCountEllips() {
        return ++countEllips;
    }

    public int getCountCir() {
        return ++countCir;
    }

    public int getCountLine() {
        return ++countLine;
    }
    @Override
    public void refresh(java.awt.Graphics canvas) {

        for (Shapes shape : shapelist) {
            shape.draw(canvas);
        }

    }

    public void addCircle(Circle circle) {
        circlelist.add(circle);
    }

    public void addRectangle(Rectangle rectangle) {
        rectanglelist.add(rectangle);
    }

    public Circle getCircle(int index) {
        return circlelist.get(index);
    }

    public Rectangle getRectangle(int index) {
        return rectanglelist.get(index);
    }
    public void addEllips(Ellips ellips) {
        ellipslist.add(ellips);
    }

    public void addSquare(Square square) {
        squarelist.add(square);
    }

    public Ellips getEllips(int index) {
        return ellipslist.get(index);
    }

    public Square getSquare(int index) {
        return squarelist.get(index);
    }
    public void addlinesegment(Linesegment linesegment) {
        linesegmentlist.add(linesegment);
    }

    public Linesegment getLinesegment(int index) {
        return linesegmentlist.get(index);
    }
}


