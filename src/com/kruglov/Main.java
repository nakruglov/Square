package com.kruglov;

import java.util.Scanner;

public class Main {
public static Rectangle inputXY(){
	Scanner scan = new Scanner(System.in);
	System.out.print("Введите координату Х первой точки: ");
	Double x1 = scan.nextDouble();
	System.out.print("Введите координату Y первой точки: ");
	Double y1 = scan.nextDouble();
	System.out.print("Введите координату Х второй точки: ");
	Double x2 = scan.nextDouble();
	System.out.print("Введите координату Y второй точки: ");
	Double y2 = scan.nextDouble();
	return new Rectangle(x1,y1,x2,y2);
}
    public static void main(String[] args) {

	    Rectangle r1 = inputXY();
	    Rectangle r2 = inputXY();
	System.out.println("s="+CrossSquare.getSquare(r1,r2));
    }
}
