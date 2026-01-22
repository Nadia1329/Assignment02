package org.example;

public class Converter {
  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;
    String formatted = String.format("%.4f", pounds);
    if (pounds == 1.0)
    {
      return formatted + " lb";
    } else {
      return formatted + " lbs";
    }
  }

public String toPoundsAndOunces(int ounces) {
  int lbs = ounces / 16;
  int oz = ounces % 16;
  String lbUnit = (lbs == 1) ? "lb" : " lbs";
  return lbs + " " + lbUnit + " " + oz + " oz";
  }
}
