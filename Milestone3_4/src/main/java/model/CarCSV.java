package model;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CarCSV {

    public void getCar(ArrayList<Car> cars) throws IOException {

        String fileName = "AllCars";
        InputStream is = null;

        try {

            is = new FileInputStream(fileName);
            CarCSVWriter writer = new CarCSVWriter();
            FileWriter output = new FileWriter("AllCars", true);

            for (Car c : cars) {
                writer.writeCar(c, output);
            }

            output.flush();
            output.close();
        } finally {
            if (is != null) {
                is.close();
            }
        }


    }
}
