package zad1;

import java.util.Random;
import java.util.Scanner;

public class Zad1 {

    private String name;
    private int course;
    private String speciality;
    private static int counter = 15000;
    private int fn;

    public void setName(String newName) {
        if (newName != null) {
            newName = name;
        } else {
            name = null;
        }
    }

    public void setCourse(int newCourse) {
        if (newCourse != 0) {
            newCourse = course;
        } else {
            course = 0;
        }
    }

    public void setSpeciality(String newSpeciality) {
        if (newSpeciality != null) {
            newSpeciality = name;
        } else {
            speciality = null;
        }
    }
    // konsktori

    public Zad1() {
        fn = Zad1.counter;
        Zad1.counter++;
        

    }

    public Zad1(String name1) {
        name = name1;

    }

    public Zad1(int course1) {
        course = course1;

    }

    public int getFn() {
        return fn;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String printName() {
        String n;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the name of student");
        n = input.next();
        return n;
    }

    public int printCourse() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the course of student");
        n = input.nextInt();
        return n;
    }

    public int randomChoise(int all) {

        int result;
        Random rand = new Random();
        return result = rand.nextInt(all) + 1;

    }

    public int randomChoisePoints() {
        int result;
        Random rand = new Random();
        return result = rand.nextInt(100 + 1);
    }

    public int CalculateTheScore() {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int e = 6;
        if (randomChoisePoints()
                >= 85) {
            return e;
        } else if (randomChoisePoints()
                >= 75) {
            return d;
        } else if (randomChoisePoints()
                >= 65) {
            return c;
        } else if (randomChoisePoints()
                >= 56) {
            return b;
        } else if (randomChoisePoints()
                <= 55) {
            return a;
        } else {
            return 0;
        }
    }
}
