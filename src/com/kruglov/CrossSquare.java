package com.kruglov;

public class CrossSquare {
    static double getSquare(Rectangle r1, Rectangle r2)
    { Double x11=r1.getX1();
      Double x12=r1.getX2();
      Double x21=r2.getX1();
      Double x22=r2.getX2();
      Double y11=r1.getY1();
      Double y12=r1.getY2();
      Double y21=r2.getY1();
      Double y22=r2.getY2();
      return crossingLength(x11,x12,x21,x22)*crossingLength(y11,y12,y21,y22);
    }
    private static double crossingLength(Double z1, Double z2, Double z3, Double z4)
    {
        if ((z1<=z3)&&(z4<=z2)) return z4-z3;
        if ((z3<=z1)&&(z2<=z4)) return z2-z1;
        if (((z1<=z3)&&(z3<z2))&&(z2<=z4)) return z2-z3;
        if (((z1<=z4)&&(z4<=z2))&&(z3<=z1)) return z4-z1;
        return 0;
    }
}
