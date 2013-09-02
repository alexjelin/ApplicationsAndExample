package gas;

public class AirMearusment {

    private Gas[] mearusments;

// dalboko kopirane na settari i gettari;
    public void setMearusments(Gas[] newMearusments) {
        if (newMearusments != null) {
            mearusments = new Gas[newMearusments.length];
            for (int i = 0; i < mearusments.length; i++) {
                mearusments[i] = new Gas(newMearusments[i]);
            }
        } else {
            throw new IllegalArgumentException("Yeahhh");
        }
    }

    public Gas[] getMearusments() {
        Gas[] copy = new Gas[mearusments.length];
        for (int k = 0; k < mearusments.length; k++) {
            copy[k] = new Gas(mearusments[k]);
        }
        return copy;
    }

    public AirMearusment(Gas[] newMear) {
        setMearusments(newMear);
    }

    public AirMearusment(AirMearusment a) {
        this(a.mearusments);
    }

    public AirMearusment() {
       // this(new Gas[]{new Gas()});
    }

    public String toString() {
        String result1 = " ";
        for (int i = 0; i < mearusments.length; i++) {
            result1 += mearusments[i];
        }
        return result1;
    }
    
// buble sort;
    public void sort() {
        for (int pass = 0; pass < mearusments.length; pass++) {
            for (int element = 0; element < mearusments.length - 1; element++) {
                if (mearusments[element].getProcent() > mearusments[element + 1].getProcent()) {
                    swap(element, element + 1);               
            }
        }
    }
}
public void swap(int number1, int number2) {
        Gas hold;
        hold = mearusments[number1];
        mearusments[number1] = mearusments[number2];
        mearusments[number2] = hold;
    }


}
