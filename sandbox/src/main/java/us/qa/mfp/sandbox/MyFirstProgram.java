package us.qa.mfp.sandbox;

public class MyFirstProgram{

  public static void main(String[] args){
    hello("Vasya");
    hello("Dolly");
    Square s = new Square(5);

    System.out.println("Area of a square with side " + s.l + " = "+s.area());

    Rectangle r=new Rectangle(4,6);
      System.out.println("Area of a rectangle with sides " + r.a + " and " +r.b+" = "+r.area());
  }
    public static void hello(String x){
      System.out.println("Hello " + x + "!");
    }


}