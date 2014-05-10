package temperatureapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Enumeration;
import gnu.io.PortInUseException;
import java.io.IOException;
import gnu.io.UnsupportedCommOperationException;
import java.util.TooManyListenersException;
import java.util.Scanner;
import gnu.io.*;

public class TemperatureApp {

    public static void transformDataInTemp(int readData) {
        try {
            if (readData > 0 && readData < 285) {
                calculateTemp95D64(readData);
            } else if (readData > 284 && readData < 322) {
                calculateTemp63D56(readData);
            } else if (readData > 321) {
                calculateTemp63D56(readData);
            } else {
                //
            }
        } catch (Exception ex) {
            System.out.println("Vaznikna Problem pri prochitane na dannite!");
            System.out.println("Prichina: " + ex.getMessage());

        }

    }

    public static double tempInKelvinDegree(double temp) {
        double tempInKelvin = 273.15 + temp;
        return tempInKelvin;
    }

    public static void calculateTemp95D64(double naprejenie) {
        double temp;
        double naprejenie2 = 157;
        double napr3 = 0;
        if (naprejenie >= 0) {
            napr3 = naprejenie - naprejenie2;
        }
        temp = 95 - napr3 / 4;
        double tempInKelvin = tempInKelvinDegree(temp);

        System.out.printf("Temperatyrata po celzii e %.2f gradusa!\n", temp);
        System.out.printf("Temperatyrata po Kelvin e %.2f gradusa!\n", tempInKelvin);
    }

    public static void calculateTemp63D56(double naprejenie) {
        double temp;
        double naprejenie2 = 284;
        double napr3 = 0;
        if (naprejenie >= 0) {
            napr3 = naprejenie - naprejenie2;
        }
        temp = 63 - napr3 / 5.5;
        double tempInKelvin = tempInKelvinDegree(temp);

        System.out.printf("Temperatyrata po celzii e %.2f gradusa!\n", temp);
        System.out.printf("Temperatyrata po Kelvin e %.2f gradusa!\n", tempInKelvin);
    }

    public static void calculateTempUnder56D(double naprejenie) {
        double temp;
        double naprejenie2 = 321;
        double napr3 = 0;
        if (naprejenie >= 0) {
            napr3 = naprejenie - naprejenie2;
        }
        temp = 56 - napr3 / 6;
        double tempInKelvin = tempInKelvinDegree(temp);

        System.out.printf("Temperatyrata po celzii e %.2f gradusa!\n", temp);
        System.out.printf("Temperatyrata po Kelvin e %.2f gradusa!\n", tempInKelvin);
    }
}
