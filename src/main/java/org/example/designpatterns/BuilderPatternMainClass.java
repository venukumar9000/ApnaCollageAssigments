package org.example.designpatterns;


/*
The Builder Pattern is used to build complex objects step-by-step.
It separates the construction process from the final object, so you can control what goes into it clearly and flexibly.
Think of it like customizing a burger or pizza — you choose the parts, and at the end, you 'build' the final product.
 */

//Burger burger = new Burger.Builder("chiken")
//        .addBuns(2)
//        .addCheese(true)
//        .addSalt(false)
//        .build();
//        System.out.println(burger);
//    }
//            }
//
//class Burger{
//    private final  String patty;
//    private boolean cheese;
//    private boolean salt;
//    private int buns;
//
//    private Burger(Builder builder){
//        this.patty=builder.patty;
//        this.cheese=builder.cheese;
//        this.salt=builder.salt;
//        this.buns=builder.buns;
//    }
//    public static class Builder{
//        private final String patty;
//        private boolean cheese;
//        private boolean salt;
//        private int buns;
//
//        public Builder(String pattrt){
//            this.patty=pattrt;
//        }
//        public Builder addCheese(boolean value){
//            this.cheese=value;
//            return this;
//        }
//        public Builder addSalt(boolean salt ){
//            this.salt=salt;
//            return this;
//        }
//        public Builder addBuns(int value){
//            this.buns=value;
//            return this;
//        }
//        public Burger build(){
//            return new Burger(this);
//        }
//
//
//    }
//    public String toString(){
//        return "Burger :"+patty+", cheese= "+cheese+" , salt="+salt+" buns="+buns;
//    }
public class BuilderPatternMainClass {
    public static void main(String[] args) {
     Burger burger = new Burger.BurgerBuilder("chiken")
             .addCheese(true)
             .addMinus(false)
             .addbuns(2)
             .build();
    }
}
class Burger{
private final String patty;
private boolean cheese;
private boolean minus;

private int buns;

private Burger(BurgerBuilder burgerBuilder){
    this.patty=burgerBuilder.patty;
    this.cheese=burgerBuilder.cheese;
    this.minus= burgerBuilder.minus;
    this.buns=burgerBuilder.buns;

}
public static class BurgerBuilder{
    private final String patty;
    private boolean cheese;
    private boolean minus;

    private int buns;

    public BurgerBuilder(String patty) {
        this.patty = patty;
    }
    public BurgerBuilder addCheese(boolean value){
        this.cheese=value;
        return this;
    }
    public BurgerBuilder addMinus(boolean value){
        this.minus=value;
        return this;
    }
    public BurgerBuilder addbuns(int value){
        this.buns=value;
        return this;
    }
    public Burger build(){
        return new Burger(this);
    }
}



}
