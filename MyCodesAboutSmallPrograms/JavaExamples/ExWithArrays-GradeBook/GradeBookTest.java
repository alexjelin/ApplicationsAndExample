import 
public class GradeBookTest {
    // main method begins program execution

    public static void main(String args[]) {
        // two-dimensional array of student grades
        int gradesArray[][] = {{87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 65, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 84},
            {87, 93, 73}};

        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
        myGradeBook.getAllAverage();
        double[] averages = null;
        double aboveLevel = 55;
        myGradeBook.filterAverages(averages, aboveLevel);

        // nulirane na masiva grades[][];
        /* v tozi sluchai vseki moje da promenq dannite ot dvumerniq masiv
         * gradesArray[][] i moje da izpolzva nepravomerno dostapa do tazi dannata
         * na istnaciqta;Tova ne syotvetsva na edin ot principite za kapsulaciq,pri 
         * koito trqbva da ima ogranichen dostyp do promenlvite na instanciqta
         * (v sluchaq grade[][]);
         */

        for (int row = 0; row < gradesArray.length; row++) {
            for (int column = 0; column < gradesArray[row].length; column++) {
                gradesArray[row][column] = 0;
            }


// izvikvane na metodite otnovo kakto e po uslovie;

            myGradeBook.displayMessage();
            myGradeBook.processGrades();

        } // end main
    } // end class GradeBookTest
    /**
     * ************************************************************************
     * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and * Pearson
     * Education, Inc. All Rights Reserved. * * DISCLAIMER: The authors and
     * publisher of this book have used their * best efforts in preparing the
     * book. These efforts include the * development, research, and testing of
     * the theories and programs * to determine their effectiveness. The authors
     * and publisher make * no warranty of any kind, expressed or implied, with
     * regard to these * programs or to the documentation contained in these
     * books. The authors * and publisher shall not be liable in any event for
     * incidental or * consequential damages in connection with, or arising out
     * of, the * furnishing, performance, or use of these programs. *
     * ***********************************************************************
     */
