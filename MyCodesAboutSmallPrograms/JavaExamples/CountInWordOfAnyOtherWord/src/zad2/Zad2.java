/*
 * konzolno prilojenie,koeto proverqva kade se sreshta in;
 */
package zad2;

public class Zad2 {

    public static void main(String[] args) {
        String text = "We are living in a yellow submarine. We don't have anything\n"
                + "else. Inside the submarine is very tight. So we are drinking\n"
                + "all the day. We will move out of it in 5 days.";
        
        int number=text.indexOf("in");
        System.out.printf("%d",number);
    }
}
