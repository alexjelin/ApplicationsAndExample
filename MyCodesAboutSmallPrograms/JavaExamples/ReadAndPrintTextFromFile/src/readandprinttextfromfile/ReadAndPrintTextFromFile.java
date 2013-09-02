/*
 * prilojenie za chetene ot fail na redove i tqhnoto printirane 
 * na nechetnite redove;
 */
package readandprinttextfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndPrintTextFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sample.txt");
// Next line may throw an exception!
        Scanner fileReader = new Scanner(file);
        int lineNumber = 0;
// Read file
        while (fileReader.hasNextLine()) {
            lineNumber++;
            if (lineNumber % 2 == 0) {
                System.out.printf("Line %d: %s%n",
                        lineNumber, fileReader.nextLine());
            }
// Close the resource after you've finished using it
            fileReader.close();
        }
    }
}
