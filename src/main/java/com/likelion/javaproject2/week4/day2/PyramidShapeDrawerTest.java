package com.likelion.javaproject2.week4.day2;

public class PyramidShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new PyramidShapeDrawer();
        shapeDrawer.printShape(4);

        ShapeDrawer paralleogramShapeDrawer = new ParallelogramShapeDrawer();
        paralleogramShapeDrawer.printShape(5);
    }
}
