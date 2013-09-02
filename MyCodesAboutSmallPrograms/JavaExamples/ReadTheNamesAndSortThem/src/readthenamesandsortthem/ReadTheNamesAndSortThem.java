/*
 * konzolno prilojenie za chetene na imena ot fail;sortiraneto im i tqhnoto zapisvane na novo;
 */
package readthenamesandsortthem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadTheNamesAndSortThem {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sample.txt");
// Next line may throw an exception!
        Scanner fileReader = new Scanner(file);

        String[] text = null;
        // chetene na faila;
        while (fileReader.hasNextLine()) {
            for (int i = 0; i < text.length; i++) {
                text[i] = fileReader.nextLine();
            }
        }

        for (int pass = 1; pass < text.length; pass++) {
            for (int element = 0; element < text.length - 1; element++) {
                if (text[element].endsWith(text[element + 1])) {
                    String hold;
                    hold = text[element];
                    text[element] = text[element + 1];
                    text[element + 1] = hold;
                }
            }
        }

        // Create a PrintStream instance
        PrintStream fileWriter = new PrintStream("numbers.txt");
        for (int num = 0; num < text.length; num++) {
            fileWriter.println(text[num]);
        }

    }
}
