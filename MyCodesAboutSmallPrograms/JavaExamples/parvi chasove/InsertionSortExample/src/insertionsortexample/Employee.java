package insertionsortexample;

public class Employee {

    private String firstName;
    private String lasName;
    private double salarie;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            throw new NullPointerException("imate prazen String");
        }
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        if (lasName != null) {
            this.firstName = firstName;
        } else {
            throw new NullPointerException("imate prazen teskt!");
        }
    }

    public double getSalarie() {
        return salarie;
    }

    public void setSalarie(double salarie) {
        if (salarie > 0) {
            this.salarie = salarie;
        } else {
            throw new NumberFormatException("Chisloto trqbva da e polojitelno !");
        }
    }

    public Employee(String fName, String lName, double salary) {
        setFirstName(fName);
        setLasName(lName);
        setSalarie(salary);
    }

    @Override
    public String toString() {
        String result = String.format("%s %s %.2f \n", getFirstName(), getLasName(), getSalarie());
        return result;
    }

    public boolean greater(Employee emp) {
        boolean comparableCondition = false;
        String tekstObjFName = getFirstName();
        String tekstObj2Fname = emp.firstName;

        String lastNameObj1 = getLasName();
        String lNameObj2 = emp.lasName;

        if (tekstObjFName.length() > tekstObj2Fname.length()) {
            return comparableCondition = true;
        }

        if (tekstObjFName.length() == tekstObj2Fname.length()) {
            if (lastNameObj1.length() > lNameObj2.length()) {
                return comparableCondition = true;
            }
        }
        return comparableCondition;
    }
}
