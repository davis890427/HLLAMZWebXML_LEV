import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomQueryHLLAMZ {
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException
    {
        File xmlFile = new File(pathname:"HLLAMZ_XML.xml");
    }
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    DocumentBuilder dBuilder = factory.newDocumentBuilder();

    Document doc = dBuilder.parse(xmlFile);

    doc.getDocumentElement().normalize();

    System.out.println("Root element: " + doc.GetDocumentElement().getNodeName());

    NodeList nList = doc.getElementsByTagName("etterem");

    for(int i = 0; i < nList.getLength(); i++) {

        Node nNode = nList.item(i);
        System.out.println("\NCurrent Element");
    }
    Element elem = (Element) nNode;

    String id = elem.getAttribute(name:"ekod");

    Node node1 = elem.GetElementsTagName("utca")

   Node node5

   System.out.println("Étterem ID: " + id);
   System.out.println("Név " + name);
   System.out.println("Cím: " + adr);
   System.out.println("Csillag: " + id);

}

