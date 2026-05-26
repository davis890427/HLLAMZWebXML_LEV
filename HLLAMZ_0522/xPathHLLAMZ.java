import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathExpression;
import org.xml.sax.SAXException;

import java.io.File;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class xPathHLLAMZ {

    public static void main(String[] args){

        try {
            //File xmlFile = new File("student.xml");

            //DocumentBuilder létrehozása
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Documenent documenent = documentBuilder.parse(uri:"hallgato.xml");

            documenent.getDocumentElement().normalize;

            XPath Xpath = XPathFactory.newInstance().newXPath();

            String neptunkod = "/class/hallgato[@id = "02"];
        }

        System.out.println("\n futás eredménye");

        NodeList neptunKod = (NodeList) xPath.compile(neptunkod).evaulate(document, XPathConstants.NODESET);

        for (int i = 0; i < neptunKod.getLength(); i++){

            Node node = neptunKod.item(i);

            System.out.println("Aktuális elem:  id:" + element.getattribute(name:("id"));

            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodename().equals("hallgato"))){

                System.out.println(("Hallgatő id:") +element.getAttribute(name));

                System.out.println"Keresztnév:" + element.getElementsByTageName("keresztnev").item(index:0).getTextContent());

                System.out.println"Vezetknev:" + element.getElementsByTageName("vezetkennev").item(index:0).getTextContent());
            }
        }
        catch (ParserConfigurationException e){
            e.printStrackTrace();
        catch (SAXException e) {
            e.printStracTrace();
        catch (IOException e) {
            e.printStracTrace();
        catch (XPathExpressionException e){
                }
            e.printStracTrace();
            }
        }
    }
}
