package com.kruglov;

public class Main {

    public static void main(String[] args) {
	Rectangle r1 = new Rectangle(-5,-5,0,0);
	Rectangle r2 = new Rectangle(-2,10,10,-2);
	System.out.println("s="+CrossSquare.getSquare(r1,r2));
    }
}
