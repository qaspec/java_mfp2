package us.qa.mfp.sandbox;

import java.sql.SQLOutput;

public class DistanceCalculator {
  public static void main(String[] args) {
    Point p1 = new Point(2, 3);
    Point p2 = new Point(4, -3);
    double result = distance(p1, p2);
    System.out.println("distance between ("+p1.x+","+p1.y+ ") and ("+p2.x+","+ p2.y+ ") equal "+result);
  }


  public static double distance (Point p1, Point p2 ){
      return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
    }


  }


