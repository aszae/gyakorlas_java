package gyak9jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        //fapados beolvasás
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("konyv.json"));
        JsonNode adatok = root.get("adatok");
        for (JsonNode adat : adatok){
            String cim = adat.get("cim").asText();
            String szerzo = adat.get("szerzo").asText();
            System.out.println(szerzo + ": " + cim);
        }
    }
}
