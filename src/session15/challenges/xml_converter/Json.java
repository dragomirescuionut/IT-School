package session15.Challenges.xml_converter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode parse(String src) {
        try {
            return objectMapper.readTree(src);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            // Handle the exception here, e.g., by logging or throwing a custom exception.
            e.printStackTrace(); // This is just an example; you can replace it with your desired error handling.
            return null; // Return a default value or handle the error according to your use case.
        }
    }
}
