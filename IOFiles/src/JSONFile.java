package IOFiles.src;




import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONFile {
    public static void writeJsonToFile(){
        var jsonObj = new JSONObject();
        try {
            jsonObj.put("ID" , "1");
            jsonObj.put("firstName" , "Ahmad");

            FileWriter file = new FileWriter("IOFiles/src/myDir/JsonFile.json");
            file.write(jsonObj.toString());
            file.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObj);
    }

    public static void readJsonFromFile() throws FileNotFoundException {
        String filePath= "IOFiles/src/myDir/JsonFile.json";
        FileReader in  = null;
        try{
            in = new FileReader(filePath);
            StringBuilder stringJson = new StringBuilder();
            int b ;
            while ((b=in.read()) != -1){
                stringJson.append((char)b);
            }
            // convert jsonString to jsonObject using parser
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(stringJson.toString());

            // how get the value ? using get() method see next line
            String valID = (String)json.get("ID");
            System.out.println(valID);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        writeJsonToFile();
        readJsonFromFile();
    }

}
