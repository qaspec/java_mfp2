package us.qa.mfp.sandbox;

public class MyFirstProgram{

  public static void main(String[] args){
    hello("Vasya");
    hello("Dolly");
    double len= 5;
    System.out.println("Area of a square with side " + len + " = "+area(len));
    double x = 5;
    double y = 7;
    System.out.println("Area of a rectangle with sides " + x + " and " +y+" = "+area(x,y));
  }
    public static void hello(String x){
      System.out.println("Hello " + x + "!");
    }
    public static double area(double l){
    return l*l;
    }
    public static double area (double a, double b){
    return a*b;
    }
}