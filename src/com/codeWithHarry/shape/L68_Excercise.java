/*
*** WRITE THIS CODE IN NOTEPAD ***
 You have to create a package named com.codewithharry.shape
 This package should have individual classes for
 * Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheritance to properly manage the code!
 Include methods like volume, surface area and getters/setters for dimensions
 */
package com.codeWithHarry.shape;

class Shape{
    int dim1,dim2;

    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }
}
class Rectangle extends Shape{

    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public int area()
    {
        return this.dim1*this.dim2;
    }
}
class Square extends Shape{

    public Square(int dim1) {
        super(dim1, -1); //=1 means dimension didnt exists
    }
    public int area()
    {
        return this.dim1*this.dim1;
    }
}
class Circle extends Shape{


    public Circle(int dim1) {
        super(dim1, -1);
    }
    public double area()
    {
        return Math.PI*this.dim1*this.dim1;
    }
}
class Cylinder extends Shape{

    public Cylinder(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public double area()
    {
        return 2*Math.PI*this.dim1 *(this.dim2+this.dim1);
    }
}
class Sphere extends Shape{


    public Sphere(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public double area()
    {
        return 4* Math.PI*this.dim1*this.dim2;
    }
}
public class L68_Excercise {
    public static void main(String[] args) {
        Cylinder c= new Cylinder(4,6);
        System.out.println(c.area());

    }
}
