package org.example.designpatterns;


/* Prototype Design Pattern—a creational design pattern
that allows you to clone existing objects without depending on their concrete classes.

 The Prototype Pattern is used when creating an object is expensive or complicated, and you want to create a copy (or clone) of an already existing object.

You don’t want to create a new object from scratch every time — instead, you just clone a ready-made prototype.
 */
//
//Shape circle = new Circle("red");
//ShapeClient client = new ShapeClient(circle);
//Shape cloneCircle = client.createShape();
//       cloneCircle.draw();
//
//    }
//            }
//interface Shape{
//    Shape clonemethod();
//    void draw();
//
//}
//class Circle implements Shape{
//
//    private String color;
//
//    Circle(String color){
//        this.color=color;
//    }
//
//    @Override
//    public Shape clonemethod() {
//        return new Circle(this.color);
//    }
//
//    @Override
//    public void draw() {
//        System.out.println("drawing a "+color+" cirlce");
//    }
//}
//class ShapeClient{
//    private Shape shapePrototype;
//
//    ShapeClient(Shape shapePrototype){
//        this.shapePrototype=shapePrototype;
//    }
//    public Shape createShape(){
//        return shapePrototype.clonemethod();
//    }
//}

public class PrototypeMainClass {
    public static void main(String[] args) {
    Shape circle = new Circle("red");
    ShapeClient clent = new ShapeClient(circle);
    Shape clone= clent.createShape();
    }
}
interface Shape{
    Shape cloneMethod();
    void draw();
}
class Circle implements Shape{
  private String color ;
    Circle(String color){
        this.color=color;
    }


    @Override
    public Shape cloneMethod() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("drawing a "+color+" circle");
    }
}
class ShapeClient{
  private   Shape prototype;

    ShapeClient(Shape prototype){
        this.prototype=prototype;
    }
    public Shape createShape(){
        return prototype.cloneMethod();

    }
}


