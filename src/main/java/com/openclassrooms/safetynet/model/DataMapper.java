package com.openclassrooms.safetynet.model;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//https://mkyong.com/java/jackson-how-to-parse-json/
//  https://www.baeldung.com/jackson-convert-java-object-to-from-json

import java.io.File;
import java.io.IOException;


public class DataMapper {
   public static void JsonToObject(String json, Object object) {
      ObjectMapper mapper = new ObjectMapper();
      try {
         Person person = mapper.readValue(new File("src/main/resources/data.json"), Person.class);
         String jsonInString = "{\"first=Name\":\"John\",\"lastName\":boby,\"adress\":[\"Ford\",\"BMW\",\"Fiat\"]}";
      } catch (JsonMappingException e) {
         e.printStackTrace();
      } catch (JsonParseException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
