package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        double radius = 10;

        double PI = 3.14;
        double diameter = radius * 2;
        double perimeter = diameter * PI;
        double area = radius * radius * PI;


        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("daimeter = " + diameter);


    }





}

/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI

 */