package session15.Challenges.xml_converter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
    @JsonProperty("color")
    private String color;
    @JsonProperty("type")
    private String type;

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }
}
