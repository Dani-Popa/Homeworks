package model;

import java.io.IOException;
import java.io.Writer;

public class CarCSVWriter {

    public static final String SEPARATOR = ",";
    public static final String NEW_LINE = "\n";

    public void writeCar(Car car, Writer output) throws IOException {
        String carCSVLine = convertToCSVLine(car);
        output.write(carCSVLine);
    }

    private String convertToCSVLine(Car car) {
        return car.getModel() + SEPARATOR + car.getManufacturer() +
                SEPARATOR + car.getPrice() + NEW_LINE;
    }
}
