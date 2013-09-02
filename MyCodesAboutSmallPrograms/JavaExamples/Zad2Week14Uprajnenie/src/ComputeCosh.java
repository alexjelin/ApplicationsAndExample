
public class ComputeCosh extends Compute {

    public double compute(double epsilon,double number) {
        double coshX = 1;
        int fac = 1;
        double razlika = 1;
        for (int i = 2; razlika > epsilon; i++) {
            double coshY = coshX;
            fac *= i;
            coshX += ( number* i * 2) / fac;
            razlika = coshX - coshY;
        }
        
        return coshX;
    }

    public ComputeCosh(double x) {
        super(x);
    }
}
