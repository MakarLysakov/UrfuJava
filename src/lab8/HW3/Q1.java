package lab8.HW3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Q1 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lab8/HW1/JSON/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            // Что хотим найти
            String findauthor = "Михаил Булгаков";

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                if (book.get("author").equals(findauthor)){
                    System.out.println("Название книги: " + book.get("title"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
