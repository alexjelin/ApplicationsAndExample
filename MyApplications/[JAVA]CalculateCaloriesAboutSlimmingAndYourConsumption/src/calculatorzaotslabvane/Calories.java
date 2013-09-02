package calculatorzaotslabvane;

import javax.xml.bind.ValidationException;

public class Calories implements CalculatorZaOtslabvane {

    private double weight;
    private double size;
    private int age;
    private Gender gender;

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setWeight(double newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            this.weight = 0;
        }
    }

    public void setSize(double newSize) {
        if (newSize > 0) {
            this.size = newSize;
        } else {
            this.size = 0;
        }
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        } else {
            this.age = 0;
        }
    }

    public void setGender(Gender newGender) {
        this.gender = newGender;
    }

    public Calories(double weight, double size, int age, Gender gender) {
        setWeight(weight);
        setSize(size);
        setAge(age);
        setGender(gender);
    }

    public Calories() {
        this(0.0, 0.0, 0, null);
    }

    public Calories(Calories copy) {
        this(copy.weight, copy.size, copy.age, copy.gender);
    }

    public String toString() {
        String result;
        result = String.format("Teglo: " + getWeight()
                + "Razmer : " + getSize()
                + "Vazrast: " + getAge()
                + "Pol: " + getWeight());
        return result;
    }

    public double restingMetabolicRate(Gender pol) {
        int number = -1;
        if (pol == Gender.FEMALE) {
            number = 0;
        }

        if (pol == Gender.MALE) {
            number = 1;
        }

        double result;
        result = 9.95 * getWeight() + 6.28 * getSize() - 4.94 * getAge() - 160 + 167 * number;
        return result;
    }

    public double dailyAverageCaloriesBurn(int aktinovst, Gender pol) {
        double result;
        double koef = 1;
        if (aktinovst == 1) {
            koef = 1.2;
        }
        if (aktinovst == 2) {
            koef = 1.38;
        }
        if (aktinovst == 3) {
            koef = 1.55;
        }
        if (aktinovst == 4) {
            koef = 1.73;
        }
        if (aktinovst == 5) {
            koef = 1.9;
        }
        result = koef* restingMetabolicRate(pol);
        return result;
    }

    public double dailyCaloriesTotalToLosePerWeek(int calories, Gender pol) {
        double result;
        result = restingMetabolicRate(pol) + (calories - 500);
        return result;
    }
}
