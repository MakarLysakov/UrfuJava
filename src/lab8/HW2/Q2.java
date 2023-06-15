package lab8.HW2;



import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Q2 {
    public static void main(String[] args) {
        try {
            // Считываем данные
            File inputFile = new File ("src/lab8/HW2/testxml.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Нарекаем rootElement считанными данными
            Element rootELement = doc.getDocumentElement();
            Element book = doc.createElement("book");

            // Создаем экземпляр книги
            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Война и мир"));
            book.appendChild(title1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("Лев Толстой"));
            book.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1869"));
            book.appendChild(year1);

            // Добавляем книгу в считанные данные
            rootELement.appendChild(book);
            System.out.println("Книга успешно добавлена");

            // Перезаписываем данные
            doc.setXmlStandalone(true);
            doc.normalize();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(inputFile);
            transformer.transform(source, result);
            System.out.println("Файл успешно сохранен!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
