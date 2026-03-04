package org.example.openclosedprinciple;

public class Rectangle implements Shape{

    int weight,height;
    Rectangle(int weight, int height){
        this.height=height;
        this.weight=weight;
    }
    @Override
    public double area() {
        return weight*height;
    }
}
