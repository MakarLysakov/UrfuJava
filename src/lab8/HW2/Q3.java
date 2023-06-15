package lab8.HW2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;

public class Q3 {
    public static void main(String[] args) {
        try {
            // Считываем данные
            File inputFile = new File ("src/lab8/HW2/testxml.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodes = doc.getElementsByTagName("book");
            // Что хотим найти
            String findyear = "1862";

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String year = element.getElementsByTagName("year").item(0).getTextContent();
                    if (year.equals(findyear)) {
                        System.out.println(element.getElementsByTagName("title").item(0).getTextContent());
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
