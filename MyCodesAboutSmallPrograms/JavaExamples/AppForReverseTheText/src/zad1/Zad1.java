/*
 *konzolno priljenie za obryshtane na String;
 */
package zad1;

public class Zad1 {

    public static void main(String[] args) {
        String text = "English";
        char[] textOfCHars = text.toCharArray();
        String reverseText=" ";

        for (int i = textOfCHars.length-1; i >= 0; i--) {
            reverseText += String.format("%c ",textOfCHars[i]);
        }
        
        System.out.printf("Teksta e %s ! \n Obyrnat e %s !\n",text,reverseText);
    }
}
