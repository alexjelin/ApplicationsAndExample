/*
 * programirane na prilojenie za kompleksni chisla;
 * 
 *Kompleksnite 4isla sa ot mnojestvoto . To vklyu4va mnojestvoto na realnite 4isla(t.e. mnojestvoto na realnite 4isla e pod mnojestvo na kompleksnite 4isla). Drug na4in da napi6em z e: z = x + iy, x e realnata 4ast na z, y e imaginernata 4ast i i se nari4a imaginerna edenica i2 = -1, i = √-1.

 Vs4ko kompleksno 4islo z = x + iy ima negovo kompleksno spregnato  = x - iy.

 z +  = 2x - realno 4islo;
 z -  = i2y - imaginerno 4islo;
 z. = x2 + y2 = |z|2 - realno 4islo
 Za vsqko kompleksno 4islo (x, y) sy6testvuva syotvetna to4ka v koordinatnata sistema. Ne moje da napi6em, 4e A > B, poradi tova ne mojem da napi6em (x1, y1) > (x2, y2), koeto zna4i, 4e kompleksnite 4isla nqmat podredba.
 * 
 * Kompleksnoto 4islo (x, y) predstavlqva dvoika naredeni realni 4isla - x i y. Ako z = (x,y) - z e kompleksno 4islo, x e realnata 4ast z,a y se nari4a imaginerna 4ast na z.

 Ako imame dve kompleksni 4isla z1 = (x1, y1) i z2 = (x2, y2) to:

 z1 = z2 <=> x1 = x2
 z1 ± z2 = (x1, y1) ± (x2, y2) = (x1 ± x2, y1 ± y2)  ( sabirane i izvajdane );
 z1.z2 = (x1, y1).(x2, y2) = (x1.x2 - y1.y2, x1.y2 + y1.x2) ( umnojenie )
 */
package complex;

public class Complex {
// deklarirane na promenlivi , chat ot kompleksnoto chislo ;

    private static double realPart;
    private static double imagineryPart;
    private static final int i = -1;
// sazdavane na gettyri ;

    public double getRealPart() {
        return realPart;
    }

    public double getImagineryPart() {
        return imagineryPart;
    }
// sazdavane na settari ;

    public void setRealPart(double realPart1) {
        if (realPart1 != 0) {
            this.realPart = realPart1;
        } else {
            this.realPart = 1;
        }
    }

    public void setImagineryPart(double imagineryPart1) {
        if (imagineryPart1 != 0) {
            this.imagineryPart = imagineryPart1;
        } else {
            this.realPart = 1;
        }
    }
// sazdavane na konskturi;

    public Complex(double realPart1, double imagineryPart1) {
        setRealPart(1);
        setImagineryPart(imagineryPart1);
    }

    public Complex() {
        this(1, 1);
    }

    public Complex(Complex c) {
        realPart = c.getRealPart();
        imagineryPart = c.getImagineryPart();
    }

// syzdavane na masiv tyrsesh obekt v ednomeren masiv list;
    public int linearSearch(Complex[] list) {
        Complex searchObject = new Complex();
        for (int index = 0; index < list.length; index++) {
            if (list[ index] == searchObject) {
                return index; // return index of integer
            }
        }

        return -1;
    }

// opredelqne na goleminata (absltutnata stoinost) na kompleksno chislo;
    public double norm(double realPart1, double imagineryPart1) {
        double norm = Math.sqrt(Math.pow(imagineryPart1, 2) + Math.pow(imagineryPart1, 2));
        return norm;
        /* formulata za namirane na goleminata ( absltutna stoinost na komklenso chislo
         * e z=a*2 + b*2 <- pod koren,pri i=-1;
         */
    }

    public static double findMaximumNorm(Complex[][] numbers) {
        double norm = 0;
        double largest = 0;
        // presmqtane na normata ot chisla na masiva numbers;
        double[] norma = new double[numbers.length];
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                for (int k = 0; k < norma.length; k++) {
                    norma[k] = Complex.realPart * Complex.imagineryPart;
                }
            }
        }

        // tyrsim max stoinost v masiva ot normi;
        for (int counter = 0; counter < norma.length; counter++) {
            if (norma[counter + 1] < norma.length) {
                if (norma[counter] > norma[counter + 1]) {
                    largest = norma[counter];
                }
            }
        }
        return largest;
    }
    
// presmqtane na suma na dve kompleksni chisla;

    public double[] sumComplexNumbers(double realPartOfUser, double imagineryPartOfUser) {
        double sumiOfRealParts;
        double sumOfImagineryParts;
        sumiOfRealParts = realPart + realPartOfUser;
        sumOfImagineryParts = imagineryPart + imagineryPartOfUser;
        double[] sumOfNumber = new double[2];
        sumOfNumber[0] = sumiOfRealParts;
        sumOfNumber[1] = sumOfImagineryParts;

        return sumOfNumber;
    }
// metod za presmqtane na razlika mejdu dve kompleksni chisla

    public double[] razlikaComplexNumbers(double realPartOfUser, double imagineryPartOfUser) {
        double razlikaiOfRealParts;
        double razlikaOfImagineryParts;
        razlikaiOfRealParts = realPart - realPartOfUser;
        razlikaOfImagineryParts = imagineryPart - imagineryPartOfUser;
        double[] razlikaOfNumber = new double[2];
        razlikaOfNumber[0] = razlikaiOfRealParts;
        razlikaOfNumber[1] = razlikaOfImagineryParts;

        return razlikaOfNumber;
    }
    // presmqtane na umnojenie na dve kompleksni chisla;

    public double[] multiplicationOFNumbers(double realPartOfUser, double imagineryPartOfUser) {
        double multipOfRealParts;
        double multipOfImagineryParts;
        multipOfRealParts = realPart * imagineryPart - realPartOfUser * imagineryPartOfUser;
        multipOfImagineryParts = realPart * imagineryPartOfUser + imagineryPartOfUser * realPartOfUser;

        double[] multiOfNumber = new double[2];
        multiOfNumber[0] = multipOfRealParts;
        multiOfNumber[1] = multipOfImagineryParts;

        return multiOfNumber;
    }

    // presmqtane na chastnoto ot dve kompleksni chisla;
    public double[] partitionOFNumbers(double realPartOfUser, double imagineryPartOfUser) {
        double partitionOfRealParts;
        double partitionOfImagineryParts;
        partitionOfRealParts = (realPart * imagineryPart - realPartOfUser * imagineryPartOfUser)
                / (Math.pow(realPartOfUser, 2) + Math.pow(imagineryPartOfUser, 2));
        partitionOfImagineryParts = (imagineryPart * realPartOfUser + imagineryPart * realPartOfUser)
                / (Math.pow(realPartOfUser, 2) + Math.pow(imagineryPartOfUser, 2));

        double[] partitionOfNumber = new double[2];
        partitionOfNumber[0] = partitionOfRealParts;
        partitionOfNumber[1] = partitionOfImagineryParts;

        return partitionOfNumber;
    }

    public String toString() {
        String result;
        result = String.format("(%.4f,%.4f", realPart, imagineryPart);
        return result;
    }
}
