package lab8.HW3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

public class Q3 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lab8/HW3/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            String findtitle = "Мастер и Маргарита";

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                if (book.get("title").equals(findtitle)){
                    jsonArray.remove(book);
                    break;
                }
            }



            JSONObject library = new JSONObject();
            JSONArray books = new JSONArray();
            library.put("books", jsonArray);

            try (FileWriter file = new FileWriter("src/lab8/HW3/example.json")){
                file.write(library.toJSONString());
                System.out.println("Json файл успешно обновлен!");
            } catch (Exception e){
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
