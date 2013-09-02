/*
 * konzolno prilojenie za izpizvane na "Hello World! ";
 */
package helloworld;

public class HelloWorld {

    public static void printTheMessage(String text) {
        text = "Hello World!";
        System.out.printf(text);
    }

    public static void main(String[] args) {
        String textOfProgram=null;
        printTheMessage(textOfProgram);
    }
}
