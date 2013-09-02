/*
 * programa za:
 * sortirane na elementite v masiv ot clasa Computer v :
 * nizhodqsht i vazhodqsht vid ; tyrsene po insex na element;
 * 
 */
package computer;

public class Computer {
// deklarirane na swoistwa na klasa;

    private String type;
    private int procSpeed;
    private String[] files;

    public String getType() {
        return type;
    }

    public int getProcSpeed() {
        return procSpeed;
    }

    public String[] getFiles() {
        return files;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        } else {
            type = "HP";
        }

    }

    public void setProcSpeed(int procSpeed) {
        if (procSpeed != 0) {
            this.procSpeed = procSpeed;
        } else {
            this.procSpeed = 1;
        }
    }

    public void setFiles(String[] files) {
        if (files != null) {
            this.files = files;
        } else {
            files[0] = "default";
        }
// syzdawane na konskturi za obshto polzwane,podrazbirane i copy konsktutor;
    }

    public Computer(String type, int procSpeed, String[] files) {
        this.type = type;
        this.procSpeed = procSpeed;
        this.files = files;
    }

    public Computer() {
    }

    public Computer(Computer c) {
        files = c.getFiles();
        type = c.getType();
        procSpeed = c.getProcSpeed();
    }
// sortirane na masiv s Selection Sort;

    static Computer[] sortFiles(Computer[] computers) {
        for (int i = 0; i < computers.length - 1; i++) {
            for (int j = i + 1; j < computers.length; j++) {
                if (computers[i].procSpeed > computers[j].procSpeed) {
                    //... Exchange elements
                    Computer temp = computers[i];
                    computers[i] = computers[j];
                    computers[j] = temp;
                }
            }
        }
        return computers;
    }
// metof za sortirane na Stringov masiv;

    public static String[] sortFiles(String[] fileArray) {
        for (int i = 0; i < fileArray.length - 1; i++) {
            for (int j = i + 1; j < fileArray.length; j++) {
                // if (fileArray[i]  fileArray[j]) {
                //... Exchange elements
                // Computer temp = computers[i];
                // computers[i] = computers[j];
                // computers[j] = temp;
            }
        }
    }
    //return computers;

// metod za tyrsene na duma v masiv;
    public int findFile(String fileName) {
        int returnStatment = 0;
        for (int i = 0; i < files.length; i++) {
            if (fileName == files[i]) {
                returnStatment = i;
                break;
            }
        }
        return returnStatment;
    }

    // definirane na dvumeren masiv i namirane na maksmalna stoinost v nego;
    static int sortFiles(Computer[][] computers) {
        Computer max = computers[0][0];
        for (Computer[] computer : computers) {
            for (Computer comp : computer) {
                if (comp < max) {
                    max = comp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
    }
}
