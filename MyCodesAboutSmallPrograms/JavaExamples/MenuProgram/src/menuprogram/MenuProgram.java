/*
 * koznolno prilojenie s menu ;
 * to moje da obryshta chisloto naobratno; napr 256 na 652;
 * da presmqta srednata stoinost na redica ot chisla;
 * reshava lineino uravnenie a*x +b =0;
 */
package menuprogram;

import java.util.Scanner;

public class MenuProgram {

    private int choise = 0;

    public int getChoise() {
        return choise;
    }

    public void setChoise(int choise) {
        this.choise = choise;
    }

    public static void menu(int choise) {
        Scanner input = new Scanner(System.in);
        displayMenu();
        choise = input.nextInt();
        if (choise == 1) {
            arrayMiddleValue();
        }
        if (choise == 2) {
            reverseNumber();
        }
        if (choise == 3) {
            otgovorLinenoUravnenie();
        }
        if (choise == 4) {
            System.out.println("Blagodarim vi za izbora");
        }


    }

    public static void displayMenu() {
        System.out.println("Molq izberete edna ot slednite opcii!");
        System.out.println("Za vavejdane i obrashtane na chislo vavedete 1!");
        System.out.println("Za vavejdane i namirane sredna sritmetichna stoinost na redica,natisnete 2!!");
        System.out.println("Za vavejdane i presmqtane na snoisnosta na lineinoto uravnenie"
                + "a*x+b=0,natisnete 3!");
        System.out.println("Za krai  natisnete 4!");
    }
// metod za namirane na srednata snoist ot vs chisla na vavedena redica ot potribitelq;

    public static void arrayMiddleValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("molq vavedete daljinata na masiva!");
        int width = input.nextInt();
        int array[] = new int[width];
        System.out.println("Molq vavedete redica ot chisla za izchislqvane na "
                + "sredna stoinost");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value += array[i] / 2;
        }
        System.out.printf("Sredanta stoinost na vavedenata ot vas"
                + "redica e %d!\n", value);
    }

// metod za obrashtane na chisloto
    public static void reverseNumber() {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Molq vavedete tri ciferno"
                + "izbrano chislo");
        number = input.nextInt();
        if (number > 999 ^ number < 0) {
            System.out.println("Molq vavedete tri ciferno"
                    + "izbrano chislo");
            number = input.nextInt();
        }

        int digit1, digit2, digit3, divider;
        digit1 = number % 10;
        divider = number / 10;
        digit2 = divider % 10;
        divider = divider / 10;
        digit3 = divider;

        System.out.printf("Obyrnatoto chislo ot vas e : %d%d%d!'n", digit3, digit2, digit2);
    }
// metod za izchislqvane na x otnosno lineino uravnenie ;

    public static void otgovorLinenoUravnenie() {
        Scanner input = new Scanner(System.in);
        System.out.println("Molq vavedete 2 chisla za prismqtane na otgovora otnostno "
                + "uravnenieto a^x+b=0");
        int number1, number2;
        number1 = input.nextInt();
        number2 = input.nextInt();

        int answerOfX = ((-number2) / number1);

        System.out.printf("X e %d", answerOfX);
    }

    public static void main(String[] args) {
        int choise1=0;
         menu(choise1);
    }
}
