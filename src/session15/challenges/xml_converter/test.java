package session15.Challenges.xml_converter;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("Yellow", "relnaut");
        try {
            objectMapper.writeValue(new File("IT-School/src/session15/Challenges/xml_converter/car.json"), car);
        } catch (IOException e) {
            // Handle the exception here, e.g., by logging or throwing a custom exception.
            e.printStackTrace(); // This is just an example; you can replace it with your desired error handling.
        }
    }
}
