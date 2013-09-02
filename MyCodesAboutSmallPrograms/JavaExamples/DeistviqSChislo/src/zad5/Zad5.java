/*
 * konzolno prilojeniev,v koeto ima vavedeno 4 ti ri cifreno chislo i se izkarva
 * - sbora na znacite mu;
 * - razpechatva znachite v obraten red;
 * - postavq posldnata cifra na parvo mqsto;
 * - razmenq mqstoto na vtorata i tretata cifra;
 */
package zad5;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int divider;
        int sumOfDigits;

        System.out.println("Please insert the 4 digits by number:");
        number = input.nextInt();

        digit1 = number % 10;
        divider = number / 10;
        digit2 = divider % 10;
        divider = divider / 10;
        digit3 = divider % 10;
        divider = divider / 10;
        digit4 = divider;
        sumOfDigits = digit1 + digit2 + digit3 + digit4;

        System.out.printf("Obyrnato chisloto e :%d%d%d%d ! \n", digit1, digit2, digit3, digit4);
        System.out.printf("pri posleden znah pred parvata cifra"
                + "chisloto  e :%d%d%d%d ! \n", digit1, digit4, digit3, digit2);
        System.out.printf("chisloto pri smqna na 3tata i 2rata cifra  e :%d%d%d%d ! \n", digit4, digit2, digit3, digit1);
        System.out.printf("Sumata na znachite na chisloto e %d ! \n", sumOfDigits);



    }
}
