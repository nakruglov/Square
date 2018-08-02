package com.kruglov;

public class Rectangle {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    Rectangle (double x1, double y1, double x2, double y2)
    {
        if (x2<x1) {
            this.x1=x2;
            this.x2=x1;
        } else
        {this.x1=x1;
         this.x2=x2;
        }
        if (y2<y1) {
            this.y1=y2;
            this.y2=y1;
        } else
        {this.y1=y1;
            this.y2=y2;
        }
    }
    double getX1(){
        return x1;
    }
    double getX2(){
        return x2;
    }
    double getY1(){
        return y1;
    }
    double getY2(){ return y2; }
}
