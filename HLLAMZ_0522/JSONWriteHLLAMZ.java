
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class JSONWriteHLLAMZ {

    public static void main(String[] args) {

        String inputFile = "orarendNeptunkod.json";
        String outputFile = "orarendNeptunkod1.json";

        try {

 
            FileInputStream fis = new FileInputStream(inputFile);
            JSONTokener tokener = new JSONTokener(fis);

            JSONObject jsonObject = new JSONObject(tokener);


            System.out.println("=== Órarend adatok ===");
            kiirJSONObject(jsonObject, 0);

  
            FileWriter writer = new FileWriter(outputFile);
            writer.write(jsonObject.toString(4));
            writer.close();

            System.out.println("\nA JSON sikeresen kiírva a következő fájlba:");
            System.out.println(outputFile);

        } catch (IOException e) {
            System.out.println("Fájlkezelési hiba: " + e.getMessage());
        }
    }


    public static void kiirJSONObject(JSONObject obj, int behuzas) {

        for (String key : obj.keySet()) {

            Object value = obj.get(key);

            for (int i = 0; i < behuzas; i++) {
                System.out.print("    ");
            }

            if (value instanceof JSONObject) {

                System.out.println(key + ":");
                kiirJSONObject((JSONObject) value, behuzas + 1);

            } else if (value instanceof JSONArray) {

                System.out.println(key + ":");
                kiirJSONArray((JSONArray) value, behuzas + 1);

            } else {

                System.out.println(key + " = " + value);
            }
        }
    }

    public static void kiirJSONArray(JSONArray array, int behuzas) {

        for (int i = 0; i < array.length(); i++) {

            Object value = array.get(i);

            for (int j = 0; j < behuzas; j++) {
                System.out.print("    ");
            }

            if (value instanceof JSONObject) {

                System.out.println("- Objektum:");
                kiirJSONObject((JSONObject) value, behuzas + 1);

            } else if (value instanceof JSONArray) {

                System.out.println("- Tömb:");
                kiirJSONArray((JSONArray) value, behuzas + 1);

            } else {

                System.out.println("- " + value);
            }
        }
    }
}