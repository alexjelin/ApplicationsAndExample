package zad1;

import java.util.Scanner;

public class TestApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameOfST;
        int all;
        all = 30;

        Zad1 Student = new Zad1(); 
        nameOfST=Student.printName();
        Student.printCourse();
        
        for(int i=0;i<=5;i++){
            int question;
            int choise;
            int grade;
            question=Student.randomChoise(all);
            choise=Student.randomChoisePoints();
            grade=Student.CalculateTheScore();
            System.out.println("Name of Student question score grade");
            System.out.printf("%-17s%-8d%-6d%-5d%n", nameOfST,question,choise,grade);
  
        }



    }
}
