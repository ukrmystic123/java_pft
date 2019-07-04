package ua.stqa.pft.sandbox;

import java.util.function.DoubleBinaryOperator;

public class Square {
  public double l;

  public Square(double l)  {
    this.l = l;

  }
  public double area() {
    return this.l * this.l;
  }
}
