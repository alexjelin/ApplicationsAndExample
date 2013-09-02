package servicenumber;

public enum CodeOfService {

    OPTIONONE(1, "Smetki na firmi"),
    OPTIONTWO(2, "Smetki za fizicheski lica");
    
    private int numberOfCode;
    private String opisanie;

    private CodeOfService(int numberOfCode, String opisanie) {
        setNumberOfCode(numberOfCode);
        setOpisanie(opisanie);
    }

    public int getNumberOfCode() {
        return numberOfCode;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setNumberOfCode(int numberOfCode) {
        if (numberOfCode == 1 && numberOfCode == 2) {
            this.numberOfCode = numberOfCode;
        } else {
            this.numberOfCode = 1;
        }
    }

    public void setOpisanie(String opisanie) {
        if (opisanie != null) {
            this.opisanie = opisanie;
        } else {
            this.opisanie="";
        }
    } 
}
