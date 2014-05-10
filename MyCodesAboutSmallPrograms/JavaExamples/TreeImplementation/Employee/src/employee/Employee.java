package employee;

public class Employee {
    
    private String fName;
    private String lName;
    private int salarie;
    
    public String getfName() {
        return fName;
    }
    
    public void setfName(String fName) {
        if (fName != null) {
            this.fName = fName;
        } else {
            throw new NullPointerException("Imeto vi e prazno!");
        }
    }
    
    public String getlName() {
        return lName;
    }
    
    public void setlName(String lName) {
        if (lName != null) {
            this.lName = lName;
        } else {
            throw new NullPointerException("Imeto vi e prazno!");
        }
    }
    
    public int getSalarie() {
        return salarie;
    }
    
    public void setSalarie(int salarie) {
        if (salarie >= 0) {
            this.salarie = salarie;
        } else {
            this.salarie = 0;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("%s %s %d \n", getfName(), getlName(), getSalarie()));
        return result.toString();
    }
    
    boolean greaterByName(Employee emp) {
        boolean statment = false;
        if (this.fName.length() > emp.fName.length()) {
            return statment = true;
        }
        if (this.fName.length() == emp.fName.length()) {
            if (this.lName.length() >= emp.lName.length()) {
                return statment = true;
            } else {
                return statment;
            }
        } else {
            return statment;
        }
    }
    
    public Employee(String fname, String lname, int salarie) {
        setfName(fname);
        setlName(lName);
        setSalarie(salarie);
    }
    
    public boolean greaterBySalary(Employee emp) {
        boolean statment = false;
        if (this.getSalarie() > emp.getSalarie()) {
            return statment = true;
        } else {
            if (this.getSalarie() == emp.getSalarie()) {
                if (this.lName.length() > emp.lName.length()) {
                    statment = true;
                }
            }
            return statment;
        }
    }
}
